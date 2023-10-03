package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Medicine;

@Controller
public class MedicineController {

	private Medicine medicine;

	public MedicineController(Medicine medicine) {
		super();
		this.medicine = medicine;
	}
	
	
	@RequestMapping(path ="/addMedicine",method = RequestMethod.GET)
	public String initForm(Model model) {
		
		model.addAttribute("command", medicine);
		
		return "addinfo";
		
	}
	
	@RequestMapping(path ="/addMedicine",method = RequestMethod.POST)
	public String submit(Medicine  model) {
		
		System.out.println(model);
		
		return "success";
		
	}
	
	
}
