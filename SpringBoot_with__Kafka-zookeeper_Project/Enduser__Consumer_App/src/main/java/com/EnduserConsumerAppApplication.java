package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnduserConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnduserConsumerAppApplication.class, args);
		System.err.println("EnduserConsumerAppApplication Running on Port No 8181 ...");
	}

}
