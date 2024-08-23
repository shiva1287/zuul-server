package com.micro.plandetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroPlanDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroPlanDetailsApplication.class, args);
	}

}
