package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.MedicineDto;

@RestController

public class ClientController {

	  
	@Autowired 
	RestTemplate template ;
	
	@GetMapping(path = "/client/medicines")
	public List<MedicineDto> getAll() {
		
		MedicineDto[] response = template.getForObject("http://MEDICINE-SERVICE/api/v1/medicines", MedicineDto[].class);

		 return Arrays.asList(response).stream().filter(e-> e.getRatePerUnit()>100).collect(Collectors.toList());

	}
}
