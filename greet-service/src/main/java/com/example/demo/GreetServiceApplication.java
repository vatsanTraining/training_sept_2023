package com.example.demo;

import org.example.demo.Dummy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.ifaces.Greeter;
import com.example.demo.model.Student;
import com.example.demo.services.BirthDayGreeter;
import com.example.demo.services.GreetingService;

@SpringBootApplication

@ComponentScan(basePackages = {"com.example.demo","org.example.demo"})

public class GreetServiceApplication {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext ctx	=SpringApplication.run(GreetServiceApplication.class, args);
	
		//System.out.println(ctx.getClass().getName());
		
		GreetingService obj   =ctx.getBean(GreetingService.class);
		  
		obj.print("Ramesh");
		
//		Greeter grtObj = new BirthdayGreeter();
//		GreetingService service = new GreetingService(grtObj);
//		service.print("ramesh");
		
		obj.getGrtList().forEach(System.out::println);
		
		System.out.println(ctx.getBean(Dummy.class));
		
		System.out.println(ctx.getBean("diwali",String.class));
		
		System.out.println(ctx.getBean("dussera",String.class));
		
		System.out.println(ctx.getBean("ram",Student.class));
		ctx.close();
	
	}

	
}
