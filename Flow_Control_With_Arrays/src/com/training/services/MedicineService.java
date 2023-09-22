package com.training.services;

import com.training.model.Medicine;

public class MedicineService {

	private Medicine[] medicineList;

	private  int idxPos = 0;
	
	private static final int MAX_SIZE =3;
	
	public MedicineService() {
	
		
	   this.medicineList = new Medicine[MAX_SIZE];
	   
	}
	
	public boolean add(Medicine medicine) {
		
		boolean isAdded = false;
		
		if(idxPos<MAX_SIZE) {
			
			this.medicineList[idxPos] = medicine;
			
			idxPos++;
			
			isAdded=true;
			
		} 
		return isAdded;
	}
	
	public Medicine[] findAll() {
		
		return this.medicineList;
	}
	
}
