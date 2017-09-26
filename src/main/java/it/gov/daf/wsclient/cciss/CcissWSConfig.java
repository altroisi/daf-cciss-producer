package it.gov.daf.wsclient.cciss;

import org.apache.ws.security.WSConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j.Wss4jSecurityInterceptor;

@Configuration
public class CcissWSConfig {

	@Value("${client.default-uri:https://ws.cciss.it/wse015/WS_CCISSEXPOService}")
	private String defaultUri;

	@Value("${client.username}")
	private String username;

	@Value("${client.password}")
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
		marshaller.setContextPath("it.dtt.e015");
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

	/*@Bean
	public HttpsUrlConnectionMessageSender httpsUrlConnectionMessageSender() throws Exception {
		HttpsUrlConnectionMessageSender httpsUrlConnectionMessageSender = new HttpsUrlConnectionMessageSender();
		httpsUrlConnectionMessageSender.setTrustManagers(trustManagersFactoryBean().getObject());
		// allows the client to skip host name verification as otherwise
		// following error is thrown:
		// java.security.cert.CertificateException: No name matching localhost
		// found
		httpsUrlConnectionMessageSender.setHostnameVerifier(new HostnameVerifier() {
			@Override
			public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
				if ("localhost".equals(hostname)) {
					return true;
				}
				return false;
			}
		});

		return httpsUrlConnectionMessageSender;
	}

	@Bean
	public KeyStoreFactoryBean trustStore() {
		KeyStoreFactoryBean keyStoreFactoryBean = new KeyStoreFactoryBean();
		keyStoreFactoryBean.setLocation(trustStore);
		keyStoreFactoryBean.setPassword(trustStorePassword);

		return keyStoreFactoryBean;
	}

	@Bean
	public TrustManagersFactoryBean trustManagersFactoryBean() {
		TrustManagersFactoryBean trustManagersFactoryBean = new TrustManagersFactoryBean();
		trustManagersFactoryBean.setKeyStore(trustStore().getObject());

		return trustManagersFactoryBean;
	}*/

}
