package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.service.PaymentService;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		
		
	ConfigurableApplicationContext 	 ctx=SpringApplication.run(PaymentServiceApplication.class, args);
	
	
	  PaymentService service = ctx.getBean(PaymentService.class);
	  
	  service.getPayments("jan").forEach(System.out::println);
	  
	  
	  System.out.println(ctx.getBean("ram",Customer.class));
	}

}
