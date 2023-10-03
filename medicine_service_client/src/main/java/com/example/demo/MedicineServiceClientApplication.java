package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.MedicineDto;

@SpringBootApplication
public class MedicineServiceClientApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	 ctx=SpringApplication.run(MedicineServiceClientApplication.class, args);
		
	 
//	  System.out.println(
//			  ctx.getBean(RestTemplate.class)
//			  .getForObject("http://localhost:8080/api/v1/medicines", String.class));
//		
	  
			 RestTemplate template = ctx.getBean(RestTemplate.class);
			 MedicineDto[] response = template.getForObject("http://localhost:8080/api/v1/medicines", MedicineDto[].class);

			 Arrays.asList(response).stream().filter(e-> e.getRatePerUnit()>100).forEach(System.out::println);
	}

	
	
	@Bean
	public RestTemplate template() {
		
		return new RestTemplate();
	}
}
