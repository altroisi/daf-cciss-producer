package it.gov.daf.wsclient.cciss;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.dtt.e015.GeteventiResponse;
import it.dtt.e015.NotiziaxmlType;
import it.gov.daf.iot.Evento;

@SpringBootApplication
public class CcissProducerApplication {

	@Value("${client.default-uri:https://ws.cciss.it/wse015/WS_CCISSEXPOService}")
	private String defaultUri;

	public static void main(String[] args) {
		SpringApplication.exit(SpringApplication.run(CcissProducerApplication.class, args));
	}
	
	@Bean
	CommandLineRunner lookup(CcissWSClient quoteClient) {
		GeteventiResponse response = quoteClient.getEventi(null);

		List<Evento> eventi = response.getEVENTI().getNOTIZIA().stream().map(new Function<NotiziaxmlType, Evento>() {
			@Override
			public Evento apply(NotiziaxmlType n) {

				Evento e = new Evento();
				e.setId("cciss." + n.getNumero() + "." + n.getVersione());


				e.setTs(Instant.from(ZonedDateTime.of(
						LocalDateTime.from(
								DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse(n.getData() + " " + n.getOra())),
						ZoneId.systemDefault())).toEpochMilli());
				e.setEventTypeId(2);
				e.setEventAnnotation(n.getTesto());
				e.setSource(defaultUri);
				e.setLocation(n.getLocalita().stream().filter(l -> l.getTipo().equals("START")).findFirst()
						.map(l2 -> l2.getLat() + "," + l2.getLng()).orElse(null));
				// e.setBody(body);
				return e;
			}
		}).collect(Collectors.toList());

		System.err.println(eventi);
		return null;
	}
}
