package org.example;

import java.sql.Connection;
import java.util.List;

import org.example.demo.MedicineRdbmsImpl;

import com.example.demo.utils.ConnectionUtils;
import com.example.ifaces.CrudRepository;
import com.training.exceptions.RangeCheckException;
import com.training.model.Medicine;
import com.training.services.MedicineService;

public class Application {

	public static void main(String[] args) {

		Connection con = ConnectionUtils.getMySqlConnection();
		
		CrudRepository<Medicine> repo = new MedicineRdbmsImpl(con);
		
		MedicineService service = new MedicineService(repo);
		
		 try {
			System.out.println("Is Added :=>"+ service.add(new Medicine(203, "Cherrycalf", "caughsyrup", 67, true)));
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		List<Medicine> list = service.findAll();
		
		for(Medicine eachMedicine : list) {
			System.out.println(eachMedicine);
		}
		
	}

}
