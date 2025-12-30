package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.kafka_Service;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/location")
public class kafka_LocationController {
	
	@Autowired
	private kafka_Service kafka_Service;

	@PostMapping("/update")
	public ResponseEntity<?> updateLocation() {
		
		//	this.kafka_Service.updateLocation("("+ (int)(Math.random()*100) + "," + (int)(Math.random()*100) + ")");
		for(int i=0;i<100;i++) {
			this.kafka_Service.updateLocation("("+ (int)(Math.random()*100) + "," + (int)(Math.random()*100) + ")");
		}
		
		return new ResponseEntity<>(Map.of("Message", "Location Updated"), HttpStatus.OK);
	}
	
	
}
