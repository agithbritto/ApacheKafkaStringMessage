package com.example.SpringBootKafka.KafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
	
	@KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId = "group-id")
	public void consume(String message){
		message = message.toUpperCase();
        LOGGER.info(String.format("Message received -> %s", message));
    }
}
