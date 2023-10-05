package com.example.demo.controllers;

import java.security.Principal;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;

@RestController
@EnableMethodSecurity(jsr250Enabled = true)
public class WelcomeController {

	
	@GetMapping("/first")
	@RolesAllowed(value = "ROLE_ADMIN")
	public String messageOne(Principal principal) {
		
		System.out.println("Name :=========="+principal.getName());
	 return "Secured Paged";	
	}
	
	
	@GetMapping("/second")
	public String messageTwo() {
		
		 return "UNSECURED PAGED";	
		}
	
	
}
