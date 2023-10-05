package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class ClientController {

	
	@Autowired
	private RestTemplate template;
	
	
	@Autowired
	private RestTemplate securedTemplate;
	
		
	@GetMapping(path = "/client")
	public String getDetails() {
		
		return template.getForObject("http://SERVICE-ONE/first", String.class);
	}
	
	@GetMapping(path = "/client/places")
	public String getPlaces() {
		
		return securedTemplate.getForObject("http://SECURED-SERVICE/places", String.class);
	}
}
