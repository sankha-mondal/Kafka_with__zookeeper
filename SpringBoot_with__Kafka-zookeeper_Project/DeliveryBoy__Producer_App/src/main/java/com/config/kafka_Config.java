package com.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.constants.AppConstants;

@Configuration
public class kafka_Config {
	
	@Bean
	public NewTopic topic() {
		
		return TopicBuilder
				.name(AppConstants.LOCATION_TOPIC_NAME)
				.build();
	}

}
