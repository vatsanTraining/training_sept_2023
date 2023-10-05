package com.example.demo.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;


@RestController
public class SecuredController {

	
	@GetMapping(path = "/places")
	@RolesAllowed({"ADMIN"})
	public String getPlaces() {

	
		return "Chennai,Goa,Pondy";

	}
	
	@GetMapping(path = "/spots")
	@RolesAllowed({"ADMIN","GUEST"})

	public String getTours() {

	
		return "Kandy,Colombo,Nurwalia";

	}
	
}
