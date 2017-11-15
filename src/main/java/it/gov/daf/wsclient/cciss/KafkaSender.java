package it.gov.daf.wsclient.cciss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;

import it.gov.daf.iotingestion.event.Event;

public class KafkaSender {

	private static final Logger log = LoggerFactory.getLogger(KafkaSender.class);

	@Value("${kafka.topic}")
	private String topic;

	@Autowired
	private KafkaTemplate<String, Event> kafkaTemplate;

	public void send(String id, Event payload) {
		log.debug("sending payload='{}' with id='{}' to topic='{}'", payload, id, topic);
		kafkaTemplate.send(topic, id, payload);
	}

}
