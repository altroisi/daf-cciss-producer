package it.gov.daf.wsclient.cciss;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import it.dtt.e015.Geteventi;
import it.dtt.e015.GeteventiResponse;
import it.dtt.e015.ObjectFactory;

public class CcissWSClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(CcissWSClient.class);

	/**
	 * Restituisce gli eventi, eventualmente filtrati per provincia, recuperati
	 * dall'invocazione del WS esposto dal CCISS
	 * 
	 * @param provincia
	 * @return
	 */
	public GeteventiResponse getEventi(String provincia) {

		Geteventi req = new Geteventi();
		if (provincia != null) {
			req.setFiltroProv(provincia);
			log.info("Requesting events for " + provincia);
		}
		JAXBElement<Geteventi> request = new ObjectFactory().createGeteventi(req);

		@SuppressWarnings("unchecked")
		JAXBElement<GeteventiResponse> response = (JAXBElement<GeteventiResponse>) getWebServiceTemplate()
				.marshalSendAndReceive(this.getDefaultUri(), request);
		if (response.getValue().getEVENTI().getCodiceMessaggio() != null) {
			log.info(response.getValue().getEVENTI().getDescrizione());
			throw new RuntimeException("WS return error code " + response.getValue().getEVENTI().getCodiceMessaggio()
					+ ": " + response.getValue().getEVENTI().getDescrizione());
		}

		return response.getValue();
	}

}
