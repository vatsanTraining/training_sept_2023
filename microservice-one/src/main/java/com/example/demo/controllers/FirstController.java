package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	
	@Value("${server.port}")
	private String portNumber;
	
	
	@GetMapping(path = "/first")
	public String getMessage() {
		
		return "Hello from "+portNumber;
	}
}
