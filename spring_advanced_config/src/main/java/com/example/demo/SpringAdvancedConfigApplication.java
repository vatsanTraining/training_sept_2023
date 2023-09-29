package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.impl.CurrencyConverter;
import com.example.demo.service.ConverterService;

@SpringBootApplication
public class SpringAdvancedConfigApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext	 ctx=SpringApplication.run(SpringAdvancedConfigApplication.class, args);
	
  ConverterService<Double,Double>  service=ctx.getBean(ConverterService.class);
	   
	  System.out.println(service.find(100.0));
	  
	  
//	  ConverterService<String,String>  service2=ctx.getBean(ConverterService.class);
//	   
//	  System.out.println(service2.find("water"));
//
//	  ctx.close();
	
	
	      
	       System.out.println("Is Singleton"+ctx.isSingleton("currencyConverter"));
	       
	       System.out.println("Is Prototype"+ctx.isPrototype("currencyConverter"));

	       
	   ctx.close();
	}


}
