package it.gov.daf.ccissproducer;

import java.io.IOException;

import javax.xml.bind.JAXBElement;
import javax.xml.transform.TransformerException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;

import it.dtt.e015.Geteventi;
import it.dtt.e015.GeteventiResponse;
import it.dtt.e015.ObjectFactory;

public class CcissWSClient extends WebServiceGatewaySupport {
	
	private static final Logger log = LoggerFactory.getLogger(CcissWSClient.class);
	
	public GeteventiResponse getEventi(String provincia) {

		JAXBElement<Geteventi> request = new ObjectFactory().createGeteventi(new Geteventi());
		request.getValue().setFiltroProv(provincia);

		log.info("Requesting events for " + provincia);

		JAXBElement<GeteventiResponse> response = (JAXBElement<GeteventiResponse>) getWebServiceTemplate()
				.marshalSendAndReceive("https://ws.cciss.it/wse015/WS_CCISSEXPOService", request);

		return response.getValue();
	}

}
