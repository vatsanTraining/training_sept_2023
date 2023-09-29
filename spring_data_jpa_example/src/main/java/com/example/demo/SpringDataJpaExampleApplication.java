package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Medicine;
import com.example.demo.services.MedicineService;
import com.example.exceptions.ElementNotFoundException;


@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	 ctx =SpringApplication.run(SpringDataJpaExampleApplication.class, args);
	
	 
	 MedicineService service = ctx.getBean(MedicineService.class);
	 
	  service.findAll().forEach(System.out::println);
	  
	  try {
		
		  System.out.println("Found"+service.findById(203));
		
		  System.out.println(service.add(ctx.getBean(Medicine.class)));
		  
		  service.remove(210);

	} catch (Exception e) {
		e.printStackTrace();
	}
	  
	  
	}


	  @Bean
	  public Medicine medcine()  throws Exception{
		  
		 return  new Medicine(1020, "Action500", "cold and cough", 34, false);
	  }
	
}
