package com.example.demo.config;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;

@Configuration
public class AppConfig {

	
	@Bean
	public Customer ram() {
		
		return new Customer(1010,"Ram","jan",5000);
	}
	
	@Bean
	public Customer shyam() {
		
		return new Customer(2020,"Shyam","jan",6000);
	}
	
	@Bean
	public Customer shiv() {
		
		return new Customer(3030,"Shiv","jan",7000);
	}
	
	
	@Bean 
	public HashMap<String, List<Customer>> list (){
		
		return new HashMap<>();
		
	}
}
