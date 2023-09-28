package com.example.demo.daos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.ifaces.Payments;
import com.example.demo.model.Customer;

@Repository
public class PaymentImpl implements Payments {

   private List<Customer> custList;
	
	private HashMap<String, List<Customer>> list;
	
	
	

	@Autowired
	public PaymentImpl(List<Customer> custList, HashMap<String, List<Customer>> list) {
		super();
		this.custList = custList;
		this.list = list;
	}

	@Override
	public Map<String, List<Customer>> getPayments() {
		
		 String month = this.custList.get(0).getMonthName();
		 
		 this.list.put(month, custList);
		 
		 return this.list;
	}

}
