package com.service;

import java.security.PrivateKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.constants.AppConstants;

@Service
public class kafka_Service {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public boolean updateLocation(String loaction) {
		
		this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, loaction);
		System.err.println("Location Updated ..."+loaction);
		return true;
	}
}
