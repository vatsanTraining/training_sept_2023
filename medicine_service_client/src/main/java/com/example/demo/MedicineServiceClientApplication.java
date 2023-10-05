package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.MedicineDto;

@SpringBootApplication
public class MedicineServiceClientApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	 ctx=SpringApplication.run(MedicineServiceClientApplication.class, args);
		

	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		
		return new RestTemplate();
	}
	
	
	
}
