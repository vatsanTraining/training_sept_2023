package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredController {

	
	@GetMapping(path = "/places")
	public String getPlaces() {

	
		return "Chennai,Goa,Pondy";

	}
}
