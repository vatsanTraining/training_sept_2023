package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ConverterService;

@SpringBootApplication
public class SpringAopExampleApplication {

	public static void main(String[] args) {
	  ConfigurableApplicationContext	ctx =SpringApplication.run(SpringAopExampleApplication.class, args);
	  
	  
	   ConverterService<Double, Double> service = ctx.getBean(ConverterService.class);
	   
	   System.out.println(service.find(20.00));
	   
	}

}
