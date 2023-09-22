package com.training;

import com.training.model.Medicine;
import com.training.services.MedicineService;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		
		Medicine dolo = new Medicine(101, "Dolo 650", "Paraceptamol", 34.00, false);
		
		
		MedicineService service = new MedicineService();
		
		 System.out.println("is Added :=>"+service.add(dolo));
		 
		 
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("Enter the Id");
		  	int id = sc.nextInt();
		 
		 System.out.println("Enter the Medicine Name");
		    String medicineName = sc.next();

		 System.out.println("Enter the Generic Name");
             String genericName = sc.next();
		 
		 System.out.println("Is Prescription Required");
             boolean prescriptionRequired = sc.nextBoolean();
		 
		 System.out.println("Rate Per Unit");
		     double ratePerUnit = sc.nextDouble();

		     Medicine toAdd =
		    		 new Medicine(id, medicineName, genericName, ratePerUnit, prescriptionRequired);
		     
		    System.out.println("Is Added :=>"+service.add(toAdd));
		    
		 Medicine[] list = service.findAll();
		 
		 
		 for(Medicine eachMedicine:list) {
			 
			 if(eachMedicine!=null) {
				 System.out.println(eachMedicine.getMedicineName());
				 System.out.println(eachMedicine.getRatePerUnit());
			 }
			 
		 }
		 
		 sc.close();
		
	}

}
