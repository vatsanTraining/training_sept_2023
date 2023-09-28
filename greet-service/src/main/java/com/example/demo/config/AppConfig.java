package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Student;

@Configuration
public class AppConfig {

	@Bean
	public String diwali() {
		
		return new String("Happy Diwali");
	}
	
	@Bean
	public String dussera() {
		
		return new String("Happy Dussera");
	}
	
	@Bean
	public Student ram() {
		
		return new Student(1010, "Ramesh", 98);
	}
}
