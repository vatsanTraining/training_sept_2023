package com.training.services;

import com.training.model.Medicine;

public class MedicineService {

	
	public Medicine process(Medicine medicine) {
		
		double currentPrice =medicine.getRatePerUnit();
		
		double increasedPrice = currentPrice + currentPrice*.10;
		
	   medicine.setRatePerUnit(increasedPrice);
	   
	   return medicine;
	}
}
