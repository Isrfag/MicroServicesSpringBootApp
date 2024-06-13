package com.microservice.workers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RestaurantWorkersMS {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantWorkersMS.class, args);
	}

}
