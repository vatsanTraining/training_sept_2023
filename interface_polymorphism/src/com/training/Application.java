package com.training;

import com.training.model.Medicine;
import com.training.repos.MedicineRepository;
import com.training.services.MedicineService;

public class Application {

	public static void main(String[] args) {

		MedicineService service = new MedicineService(new MedicineRepository());
		
		System.out.println( "is Added :=>"+service.add(new Medicine(101, "Crocin", "Paraceptmol", 45, false)));
	
		System.out.println( "is Added :=>"+service.add(new Medicine(102, "Gelusil", "Antacid", 35, false)));

		
		Medicine[] list = service.findAll();
		
		for(Medicine eachMedicine : list) {
			
			if(eachMedicine!=null) {
				System.out.println(eachMedicine);
			}
		}
		
		System.out.println("Medicine With Id :=>"+ service.findById(102));
	}

}
