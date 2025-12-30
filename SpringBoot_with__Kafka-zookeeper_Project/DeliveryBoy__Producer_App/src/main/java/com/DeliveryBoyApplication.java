package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeliveryBoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryBoyApplication.class, args);
		System.err.println("DeliveryBoyApplication running on Port No: 8080 ...");
	}
	
	/*
	1. Start the ZooKeeper service
	>> .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

	2. START THE KAFKA BROKER SERVICE
	>> .\bin\windows\kafka-server-start.bat .\config\server.properties
	
	3. READ THE EVENTS
	>> .\bin\windows\kafka-console-consumer.bat --topic location-update-topic --from-beginning --bootstrap-server localhost:9092
	*/

}
