package com.microservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RstConfigServer {

	public static void main(String[] args) {
		SpringApplication.run(RstConfigServer.class, args);
	}

}
