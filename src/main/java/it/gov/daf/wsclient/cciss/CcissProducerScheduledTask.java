package it.gov.daf.wsclient.cciss;

import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.namespace.QName;

import org.mapdb.DB;
import org.mapdb.HTreeMap;
import org.mapdb.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import it.dtt.e015.GeteventiResponse;
import it.dtt.e015.LocalitaxmlType;
import it.dtt.e015.NotiziaxmlType;
import it.gov.daf.iotingestion.event.Event;

@Component
public class CcissProducerScheduledTask {

	private static final Logger log = LoggerFactory.getLogger(CcissProducerScheduledTask.class);

	@Value("${client.default-uri:https://ws.cciss.it/wse015/WS_CCISSEXPOService}")
	private String defaultUri;

	@Autowired
	private DB db;

	@Autowired
	private CcissWSClient ccissClient;

	@Autowired
	private KafkaSender sender;
	
	@Scheduled(fixedRateString = "${scheduler.pullinterval}")
	public void pullEvents() {

		log.info("Start new interation");

		// cache
		HTreeMap<String, Long> cache = db.hashMap("cciss-events-cache", Serializer.STRING, Serializer.LONG)
				.expireAfterCreate(60, TimeUnit.MINUTES)
				.expireAfterGet(60, TimeUnit.MINUTES)
				.createOrOpen();

		// cciss service invocation
		log.info("Pulling events...");
		GeteventiResponse response = ccissClient.getEventi(null);

		// sending to kafka
		response.getEVENTI().getNOTIZIA().parallelStream().map(EventBuilder::build)
				.filter(e -> !cache.containsKey(e.getId().toString())).forEach(e -> {
					cache.put(e.getId().toString(), e.getTs());
					sender.send(e.getId().toString(), e);
				});

		db.commit();
		log.info("End of interation");

	}

	private static class EventBuilder {

		public static Event build(NotiziaxmlType n) {
			
			Long version = 1L; 
			String eventId = "cciss." + n.getNumero() + "." + n.getVersione();
			Long timestamp = Instant.from(ZonedDateTime.of(LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse(n.getData() + " " + n.getOra())),ZoneId.systemDefault())).toEpochMilli();
			CharSequence temporalGranularity=null; 
			Double eventCertainty = 1D; 
			Integer eventTypeId = 2; 
			CharSequence eventSubtypeId = "CCISS_" + n.getEvento();
			CharSequence eventAnnotation = n.getTesto();
			CharSequence source = "defaultUri";
			CharSequence location = n.getLocalita().stream().filter(l -> l.getTipo().equals("START")).findFirst()
					.map(l2 -> l2.getLat() + "," + l2.getLng())
					.orElse(n.getLocalita().stream().filter(l -> l.getTipo().equals("AFFECTED")).findFirst()
							.map(l2 -> l2.getLat() + "," + l2.getLng()).orElse(null));

			ByteBuffer body = ByteBuffer.wrap(n.toString().getBytes());
			try {
				Marshaller marshaller = JAXBContext.newInstance(NotiziaxmlType.class).createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
				JAXBElement<NotiziaxmlType> jx = new JAXBElement<NotiziaxmlType>(new QName("notiziaxmlType"),
						NotiziaxmlType.class, n);
				StringWriter sw = new StringWriter();
				marshaller.marshal(jx, sw);
				String xmlString = sw.toString();
				body = ByteBuffer.wrap(xmlString.getBytes());
			} catch (PropertyException e) {
				e.printStackTrace();
			} catch (JAXBException e) {
				e.printStackTrace();
			}
			
			Map<CharSequence, CharSequence> attributes = new HashMap<>();
			attributes.put("priorita", n.getPriorita());
			attributes.put("locationDBVersion", n.getLocationDBVersion());
			attributes.put("luogo_punto", n.getLuogoPunto());
			attributes.put("direzione", n.getDirezione());
			attributes.put("nomedirezione", n.getNomedirezione());
			attributes.put("tipo", n.getTipo());

			LocalitaxmlType startLoc = n.getLocalita().stream().filter(l -> l.getTipo().equals("START")).findFirst()
					.orElse(null);
			if (startLoc != null) {
				attributes.put("start_code", startLoc.getCode());
				attributes.put("start_lat", startLoc.getLat());
				attributes.put("start_lon", startLoc.getLng());
				attributes.put("start_prov", startLoc.getProv());
				attributes.put("start_reg", startLoc.getReg());
			}

			LocalitaxmlType endLoc = n.getLocalita().stream().filter(l -> l.getTipo().equals("END")).findFirst()
					.orElse(null);
			if (endLoc != null) {
				attributes.put("end_code", endLoc.getCode());
				attributes.put("end_lat", endLoc.getLat());
				attributes.put("end_lon", endLoc.getLng());
				attributes.put("end_prov", endLoc.getProv());
				attributes.put("end_reg", endLoc.getReg());
			}

			return new Event(version, eventId, timestamp, temporalGranularity, eventCertainty, eventTypeId,
					eventSubtypeId, eventAnnotation, source, location, body, attributes);
		}

	}
}
