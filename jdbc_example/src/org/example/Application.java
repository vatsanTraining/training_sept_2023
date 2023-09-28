package org.example;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.example.demo.MedicineRdbmsImpl;
import org.example.demo.ifaces.MedicineRepository;
import org.example.demo.services.LatestMedicineService;

import com.example.demo.utils.ConnectionUtils;
import com.example.exceptions.ElementNotFoundException;
import com.example.ifaces.CrudRepository;
import com.training.exceptions.RangeCheckException;
import com.training.model.Medicine;
import com.training.services.MedicineService;

public class Application {

	public static void main(String[] args) {

		Connection con = ConnectionUtils.getMySqlConnection();
		
		MedicineRepository repo = new MedicineRdbmsImpl(con);
		
		MedicineService service = new LatestMedicineService(repo);
		
		 try {
			System.out.println("Is Added :=>"+ service.add(new Medicine(210, "Savlon", "Sanitizer", 27, false)));
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		List<Medicine> list = service.findAll();
		
		for(Medicine eachMedicine : list) {
			System.out.println(eachMedicine);
		}
		
		try {
			System.out.println("Row Deleted :=>"+repo.removeById(204));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}

		
		try {
			System.out.println("Row Found :=>"+repo.findById(102));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}

		LatestMedicineService serviceRef =(LatestMedicineService)service;
		
		System.out.println("Medicine Value Greater than 50");
		serviceRef.getMedicineGrtThan(50).forEach(System.out::println);
		
		
		   Map<String,Double> map=serviceRef.getMedicineNameAndPrice(50);
		   
		   Set<Map.Entry<String,Double>> keys = map.entrySet();
		   
		   for(Map.Entry<String, Double> eachItem : keys) {
			   
			   System.out.println(eachItem.getKey() + eachItem.getValue());
		   }
		    System.out.println("Result");
		   serviceRef.getMedicineByCondition(e -> e.getId()>110).forEach(System.out::println);
		   
		   System.out.println("Top 2 By Name");
		   
		   serviceRef.topN(2).forEach(System.out::println);
		   
		   System.out.println("maximum price :=>"+ serviceRef.findItemwithMaxPrice());
	}

}
