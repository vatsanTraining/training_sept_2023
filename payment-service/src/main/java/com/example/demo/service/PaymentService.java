package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.Payments;
import com.example.demo.model.Customer;

@Service
public class PaymentService {

	
	private Payments repo;
		
	public PaymentService() {
		super();
	}

	@Autowired
	public void setRepo(Payments repo) {
		this.repo = repo;
	}

	public List<Customer> getPayments(String string) {
		
		return  this.repo.getPayments().get(string);
		 
	}

	
	
}
