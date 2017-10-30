package it.gov.daf.wsclient.cciss;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.kafka.listener.MessageListenerContainer;
import org.springframework.kafka.test.rule.KafkaEmbedded;
import org.springframework.kafka.test.utils.ContainerTestUtils;
import org.springframework.test.context.junit4.SpringRunner;

import it.gov.daf.iotingestion.event.Event;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaSenderTests {

	protected final static String HELLOWORLD_TOPIC = "helloworld.t";

	@Autowired
	private KafkaListenerEndpointRegistry kafkaListenerEndpointRegistry;

	@Autowired
	private KafkaSender sender;

	@ClassRule
	public static KafkaEmbedded kafkaEmbedded = new KafkaEmbedded(1, true, HELLOWORLD_TOPIC);

	@Before
	public void runBeforeTestMethod() throws Exception {
		// wait until all the partitions are assigned
		for (MessageListenerContainer messageListenerContainer : kafkaListenerEndpointRegistry
				.getListenerContainers()) {
			ContainerTestUtils.waitForAssignment(messageListenerContainer, kafkaEmbedded.getPartitionsPerTopic());
		}
	}

	@Test
	public void testReceive() throws Exception {
		Event e = new Event();
		e.setVersion(1L);
		e.setId("Prova");
		e.setTs(1L);
		e.setTemporalGranularity(null);
		e.setEventCertainty(0D);
		e.setEventTypeId(2);
		e.setEventSubtypeId("1");
		e.setEventAnnotation("1");
		e.setSource("1");
		e.setLocation("1");
		e.setBody(ByteBuffer.wrap(new String("AAA").getBytes()));
		Map<CharSequence, CharSequence> attributes = new HashMap<>();
		attributes.put("user-id", "id");
		attributes.put("user-screen_name", "screen_name");
		e.setAttributes(attributes);
		sender.send("Hello", e);
	}

}
