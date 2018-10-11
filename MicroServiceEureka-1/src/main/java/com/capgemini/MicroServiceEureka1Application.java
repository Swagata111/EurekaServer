package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceEureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceEureka1Application.class, args);
	}
}
