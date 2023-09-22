package com.example.demo.services;

import com.example.demo.HealthInsurance;
import com.example.demo.Insurance;
import com.example.demo.VechcileInsurance;

public class InsuranceService {

	
	public double findPremium(Insurance insurance) {
		
		return  insurance.calculatePremium();
	}
	
	
	
	
	public Insurance getProduct(int key) {
		
		switch (key) {
		case 1:
			return new HealthInsurance(1020230, 500000, 60, false);
		case 2:
			 return new VechcileInsurance(012020,200000, "pulsar");
		default:
			return null;
		}
	}
}
