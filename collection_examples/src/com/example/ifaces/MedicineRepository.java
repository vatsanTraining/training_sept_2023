package com.example.ifaces;

import com.example.exceptions.ElementNotFoundException;
import com.training.model.Medicine;

public interface MedicineRepository extends CrudRepository<Medicine> {

	Medicine findById(int id) throws ElementNotFoundException;
	int removeById(int id) throws ElementNotFoundException;
	
}
