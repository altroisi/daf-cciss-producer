package it.gov.daf.wsclient.cciss;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import it.dtt.ws.ccissexpo.GeteventiResponseType;
import it.dtt.ws.ccissexpo.GeteventiType;
import it.dtt.ws.ccissexpo.ObjectFactory;

public class CcissWSClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(CcissWSClient.class);

	/**
	 * Restituisce gli eventi, eventualmente filtrati per provincia, recuperati
	 * dall'invocazione del WS esposto dal CCISS
	 * 
	 * @param provincia
	 * @return
	 */
	public GeteventiResponseType getEventi(String provincia) {

		GeteventiType req = new GeteventiType();
		if (provincia != null) {
			req.setFiltroProv(provincia);
			log.info("Requesting events for " + provincia);
		}
		JAXBElement<GeteventiType> request = new ObjectFactory().createRichiestaCcissExpo(req);

		@SuppressWarnings("unchecked")
		JAXBElement<GeteventiResponseType> response = (JAXBElement<GeteventiResponseType>) getWebServiceTemplate()
				.marshalSendAndReceive(this.getDefaultUri(), request);
		if (response.getValue().getMESSAGGI() != null) {
			log.info(response.getValue().getMESSAGGI().getMessaggio().get(0).getDescrizioneMessaggio());
			throw new RuntimeException("WS return error code " + response.getValue().getMESSAGGI().getMessaggio().get(0).getCodiceMessaggio()
					+ ": " + response.getValue().getMESSAGGI().getMessaggio().get(0).getDescrizioneMessaggio());
		}

		return response.getValue();
	}

}
