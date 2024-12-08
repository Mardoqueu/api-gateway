package com.challenge.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * The GatewayApplication class serves as the entry point for the Spring Boot application.
 * It is configured with the @SpringBootApplication annotation, which denotes it as a Spring Boot
 * application, and the @EnableFeignClients annotation, which allows for the enabling of Feign clients
 * within the application context. The main method in this class uses SpringApplication.run to
 * bootstrap the application.
 */
@SpringBootApplication
@EnableFeignClients
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
