package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.constants.AppConstants;


@Configuration
public class Kafka_Config {

	@KafkaListener(topics=AppConstants.LOCATION_TOPIC_NAME, groupId=AppConstants.GROUP_ID)
	public void updatedLocation(String value) {
		
		System.err.println("Current location: "+value);
	}
	
	
}
