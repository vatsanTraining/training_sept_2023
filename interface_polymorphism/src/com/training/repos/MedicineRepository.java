package com.training.repos;

import com.training.ifaces.CrudRepository;
import com.training.model.Medicine;

public class MedicineRepository implements CrudRepository {

	private Medicine[] medicineList;

	private  int idxPos = 0;
	
	private static final int MAX_SIZE =3;

	
	public MedicineRepository() {
		super();
		   this.medicineList = new Medicine[MAX_SIZE];
	}

	@Override
	public boolean add(Medicine obj) {

		boolean isAdded = false;
		
		if(idxPos<MAX_SIZE) {
			
			this.medicineList[idxPos] = obj;
			
			idxPos++;
			
			isAdded=true;
			
		} 
		return isAdded;	
		}

	@Override
	public Medicine[] findAll() {
		return this.medicineList;
	}

	@Override
	public Medicine findById(int id) {

		boolean found = false;
		
		Medicine foundMedicine = null;
		
		int i = 0;
		
		while(!found && i<MAX_SIZE) {
			
			if(this.medicineList[i].getId()==id) {
				foundMedicine=this.medicineList[i];
				found = true;
			}
			   i++;

		}
		return foundMedicine;
	}
	
}
