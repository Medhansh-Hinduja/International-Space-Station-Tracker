package com.hinduja.medhansh.ISSTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class IssTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IssTrackerApplication.class, args);
	}

}
