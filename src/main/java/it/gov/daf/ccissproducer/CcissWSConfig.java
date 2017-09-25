package it.gov.daf.ccissproducer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CcissWSConfig {

//	@Value("${client.default-uri}")
//	private String defaultUri;
//
//	@Value("${client.ssl.trust-store}")
//	private Resource trustStore;
//
//	@Value("${client.ssl.trust-store-password}")
//	private String trustStorePassword;

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		// this package must match the package in the <generatePackage>
		// specified in pom.xml
		marshaller.setContextPath("it.dtt.e015");
		return marshaller;
	}

	@Bean
	public CcissWSClient quoteClient(Jaxb2Marshaller marshaller) throws Exception {
		CcissWSClient client = new CcissWSClient();
		client.setDefaultUri("https://ws.cciss.it/wse015/WS_CCISSEXPOService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
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
