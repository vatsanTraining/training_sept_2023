package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Medicine;
import com.example.demo.services.MedicineService;

import jakarta.validation.Valid;


@RestController
@RequestMapping(path = "/api/v1/medicines")
public class MedicineController {

	private Medicine medicine;
	private MedicineService service;

	@Autowired
	public MedicineController(Medicine medicine,MedicineService service) {
		super();
		this.medicine = medicine;
		this.service = service;
		
	}
			
	@GetMapping
	public List<Medicine> findAll() {
		
       return  this.service.findAll();
			
	}
	@PostMapping
	public ResponseEntity<Object> submit(@Valid @RequestBody Medicine  model) {
				
		return ResponseEntity.status(201).body(this.service.add(model));
				
	}
	
	

}
