package it.gov.daf.ccissproducer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.dtt.e015.GeteventiResponse;

@SpringBootApplication
public class CcissProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcissProducerApplication.class, args);
	}
	
	@Bean
	CommandLineRunner lookup(CcissWSClient quoteClient) {
		return args -> {
			GeteventiResponse response = quoteClient.getEventi("RM");
			System.err.println(response.getEVENTI().getNOTIZIA());
		};
	}
}
