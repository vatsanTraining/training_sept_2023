package com.training;

import com.training.model.Medicine;
import com.training.model.PostGraduateStudent;
import com.training.services.MedicineService;

import java.util.*;

public class Application {

	public static void main(String[] args) {

		
		Medicine dolo = new Medicine(101, "Dolo 650", "Paraceptamol", 34.00, false);
		
		
		MedicineService service = new MedicineService();
		
		 System.out.println("is Added :=>"+service.add(dolo));
		 
		 
		 
//		 Scanner sc = new Scanner(System.in);
//		 
//		 String choice ="no";
//		 
//		 do {
//			 
//		 
//		 System.out.println("Enter the Id");
//		  	int id = sc.nextInt();
//		 
//		 System.out.println("Enter the Medicine Name");
//		    String medicineName = sc.next();
//
//		 System.out.println("Enter the Generic Name");
//             String genericName = sc.next();
//		 
//		 System.out.println("Is Prescription Required");
//             boolean prescriptionRequired = sc.nextBoolean();
//		 
//		 System.out.println("Rate Per Unit");
//		     double ratePerUnit = sc.nextDouble();
//
//		     Medicine toAdd =
//		    		 new Medicine(id, medicineName, genericName, ratePerUnit, prescriptionRequired);
//		     
//		    System.out.println("Is Added :=>"+service.add(toAdd));
//		    
//		    System.out.println("Enter Yes to continue No to stop");
//		    
//		    choice = sc.next();
//		 }
//		 while(choice.equals("yes"));
		 
		 
		 Medicine[] list = service.findAll();
		 
		 
		 for(Medicine eachMedicine:list) {
			 
			 if(eachMedicine!=null) {
//				 System.out.println(eachMedicine.getMedicineName());
//				 System.out.println(eachMedicine.getRatePerUnit());
				 System.out.println(eachMedicine);
			 }
			 
		 }
		 
			Medicine dole= new Medicine(101, "Dolo 650", "Paraceptamol", 34.00, false);

		   Medicine other= dole;
		   
			System.out.println("Is Equal :=>"+ dolo.equals(dole));
			
			
			PostGraduateStudent ram = new PostGraduateStudent(102, "Ram kumar", "Shyam Kumar");
			
			System.out.println(ram);
			
			
		 
		// sc.close();
		
	}

}
