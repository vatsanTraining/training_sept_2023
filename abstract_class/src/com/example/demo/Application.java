package com.example.demo;

import com.example.demo.services.InsuranceService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int choice = Integer.parseInt(args[0]);
		
		InsuranceService service = new InsuranceService();
		
	Insurance insurance	= service.getProduct(choice);
		 
		System.out.println(service.findPremium(insurance));
		 
		 
	}

}
