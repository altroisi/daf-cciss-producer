package it.gov.daf.wsclient.cciss;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CcissProducerApplication {

	@Value("${mapdb.file}")
	private String mapdbfile;

	public static void main(String[] args) {
		SpringApplication.run(CcissProducerApplication.class, args);
	}

	@Bean
	public DB mapDB() {
		return DBMaker.fileDB(mapdbfile).make();
	}
}
