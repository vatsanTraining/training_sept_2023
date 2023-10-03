package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Medicine;
import com.example.demo.services.MedicineService;

@Controller
public class MedicineController {

	private Medicine medicine;
	private MedicineService service;

	@Autowired
	public MedicineController(Medicine medicine,MedicineService service) {
		super();
		this.medicine = medicine;
		this.service = service;
		
	}
	
	
	@RequestMapping(path ="/addMedicine",method = RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("command", medicine);
		
		return "addinfo";
		
	}
	
	@RequestMapping(path ="/addMedicine",method = RequestMethod.POST)
	public String submit(Medicine  model) {
		
		System.out.println(model);
		
		this.service.add(model);
		
		return "success";
		
	}
	
	
}
