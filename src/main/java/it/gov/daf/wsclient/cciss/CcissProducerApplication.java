package it.gov.daf.wsclient.cciss;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.StringUtils;

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
		if (StringUtils.isEmpty(mapdbfile)) {
			return DBMaker.memoryDB().make();
		} else {
			return DBMaker.fileDB(mapdbfile).make();
		}
	}
}
