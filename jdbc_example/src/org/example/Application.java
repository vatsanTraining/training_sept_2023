package org.example;

import java.sql.Connection;
import java.util.List;

import org.example.demo.MedicineRdbmsImpl;
import org.example.demo.ifaces.MedicineRepository;

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
		
		MedicineService service = new MedicineService(repo);
		
		 try {
			System.out.println("Is Added :=>"+ service.add(new Medicine(204, "Cherrycalf", "caughsyrup", 67, true)));
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

	}

}
