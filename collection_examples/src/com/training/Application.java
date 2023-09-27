package com.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.example.ifaces.CrudRepository;
import com.training.exceptions.RangeCheckException;
import com.training.model.Medicine;
import com.training.repos.MedicineInMemoryImpl;
import com.training.services.MedicineService;

public class Application {

	
	public static CrudRepository<Medicine> repoFactory(int key){
		
		switch (key) {
		case 1:
			
			return new MedicineInMemoryImpl();
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {

		
		MedicineService service = new MedicineService(repoFactory(1));
		
		
		try {
		 System.out.println("is Added :=>"+service.add(new Medicine(201, "Zincovit", "Parceptmol", 45, false)));
			
			System.out.println("Is Added :=>"+service.add(new Medicine(102, "Gelusil", "Antacid", 35, false)));
			
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}

		
		
		  List<Medicine> list = service.findAll();
		  
		  
		  Iterator<Medicine> itr = list.iterator();
		  
		  while(itr.hasNext()) {
			  
			  System.out.println(itr.next());
		  }
		
		  System.out.println("Sorted By Name");
		  
		   List<Medicine> sortedList =    service.sortByProp("id");
		   
		   for(Medicine eachMedicine:sortedList) {
			   
			   System.out.println(eachMedicine);
		   }
		  
//		  List<String> names = new ArrayList<>();
//		  
//		  names.add("Anand");
//		  names.add("Kumar");
//		  names.add("Tamil");
//		  names.add("Ram");
//		  names.add("Edward");
//		
//		  Collections.sort(names);
//		  
//		  System.out.println(names);
	}

}
