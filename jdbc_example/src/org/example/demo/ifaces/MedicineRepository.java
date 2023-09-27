package org.example.demo.ifaces;

import com.example.exceptions.ElementNotFoundException;
import com.example.ifaces.CrudRepository;
import com.training.model.Medicine;

public interface MedicineRepository extends CrudRepository<Medicine>{

	Medicine findById(int id) throws ElementNotFoundException;
	int removeById(int id) throws ElementNotFoundException;
	
}
