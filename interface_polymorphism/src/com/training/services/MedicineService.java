package com.training.services;

import com.training.ifaces.CrudRepository;
import com.training.model.Medicine;

public class MedicineService {

	
	private CrudRepository repo;

	public MedicineService(CrudRepository repo) {
		super();
		this.repo = repo;
	}
	
	public boolean add(Medicine entity) {
		
		return this.repo.add(entity);
	}
	
	public Medicine[] findAll() {
		
		return this.repo.findAll();
	}
	
	
	public Medicine findById(int id) throws Exception {
		
		Medicine obj = this.repo.findById(id);
		
		
	if(obj==null) {
		throw new Exception("Element With "+ id + " Not found");// must follow declare or handle rule
		//throw new RuntimeException("Element With "+ id + "Not found"); // doesnot follow declare or handle rule
	} else {
		return obj;
	}
	}
	
}
