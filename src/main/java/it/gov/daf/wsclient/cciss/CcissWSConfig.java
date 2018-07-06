package it.gov.daf.wsclient.cciss;

import org.apache.ws.security.WSConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
/*
 * sembra che le versioni di spring-ws-security successive alla 2.2.4 abbiano un problema con la nuova classe 
 * (vedi https://jira.spring.io/browse/SWS-970)
 */
import org.springframework.ws.soap.security.wss4j.Wss4jSecurityInterceptor;

@Configuration
public class CcissWSConfig {

	@Value("${cciss-ws.uri}")
	private String defaultUri;

	@Value("${cciss-ws.username}")
	private String username;

	@Value("${cciss-ws.password}")
	private String password;
	
	@Bean
    public Wss4jSecurityInterceptor securityInterceptor(){
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions("UsernameToken");
		wss4jSecurityInterceptor.setSecurementUsername(username);
		wss4jSecurityInterceptor.setSecurementPassword(password);
        wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);;
        wss4jSecurityInterceptor.setSecurementMustUnderstand(false);
        return wss4jSecurityInterceptor;
    }

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("it.dtt.ws.ccissexpo");
		return marshaller;
	}

	@Bean
	public CcissWSClient ccissClient(Jaxb2Marshaller marshaller) throws Exception {
		CcissWSClient client = new CcissWSClient();
		client.setDefaultUri(defaultUri);
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		ClientInterceptor[] interceptors = new ClientInterceptor[] {securityInterceptor()};
		client.setInterceptors(interceptors);
		// set a httpsUrlConnectionMessageSender to handle the HTTPS session
//		client.setMessageSender(httpsUrlConnectionMessageSender());
		return client;
	}

}
