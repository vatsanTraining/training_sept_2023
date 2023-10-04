package com.example.demo.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	@GetMapping("/first")
	public String messageOne(Principal principal) {
		
		System.out.println("Name :=========="+principal.getName());
	 return "Secured Paged";	
	}
	
	
	@GetMapping("/second")
	public String messageTwo() {
		
		 return "UNSECURED PAGED";	
		}
	
	
}
