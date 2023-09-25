package com.training;

import com.training.exceptions.RangeCheckException;
import com.training.model.Medicine;
import com.training.repos.MedicineRepository;
import com.training.services.MedicineService;

public class Application {

	public static void main(String[] args)  {

		MedicineService service = new MedicineService(new MedicineRepository());
		
		try {
			
			System.out.println( "is Added :=>"+service.add(new Medicine(101, "Crocin", "Paraceptmol", 45, false)));

			System.out.println( "is Added :=>"+service.add(new Medicine(102, "Gelusil", "Antacid", 35, false)));
		
			System.out.println( "is Added :=>"+service.add(new Medicine(103, "Bcausle", "Bcomplex", 25, false)));
			
		} catch (RangeCheckException e1) {
			
			System.err.println(e1.getMessage());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		
		Medicine[] list = service.findAll();
		
		for(Medicine eachMedicine : list) {
			
			if(eachMedicine!=null) {
				System.out.println(eachMedicine);
			}
		}
		
		try {
			System.out.println("Medicine With Id :=>"+ service.findById(202));
		} catch (Exception e) {

			 e.printStackTrace();
		}
	}

}
