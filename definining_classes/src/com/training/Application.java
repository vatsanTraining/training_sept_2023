package com.training;

import com.training.model.Medicine;
import com.training.services.MedicineService;

public class Application {

	public static void main(String[] args) {

		Medicine dolo =new Medicine(101,"DOLO650","paraceptamol",45.00,false);
		
		System.out.println(dolo.getGenericName());
		System.out.println(dolo.isPrescriptionRequired());
		
		Medicine geminor = new Medicine();
		
		geminor.setGenericName("Metformin");
		geminor.setPrescriptionRequired(true);
		
		System.out.println(geminor.getGenericName());
		System.out.println(geminor.isPrescriptionRequired());
	
		geminor.setRatePerUnit(560.00);
		
		Medicine sample = new Medicine(45.00, false);
		
		System.out.println(sample.getGenericName());
		
		MedicineService service = new MedicineService();
		
		System.out.println("Before Call"+ dolo.getRatePerUnit());
		
		 dolo = service.process(dolo);
		  
		  System.out.println("After Call"+ dolo.getRatePerUnit());
		  
		  
	}

}
