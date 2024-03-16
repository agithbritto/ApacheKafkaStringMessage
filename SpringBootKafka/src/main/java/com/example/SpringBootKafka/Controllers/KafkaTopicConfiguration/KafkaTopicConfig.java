package com.example.SpringBootKafka.Controllers.KafkaTopicConfiguration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaTopicConfig {

	@Value("${spring.kafka.topic.name}")
	private String topicName;
	
	public NewTopic kafkaTopic() {
		return TopicBuilder.name(topicName)
                .build();
	}
}
