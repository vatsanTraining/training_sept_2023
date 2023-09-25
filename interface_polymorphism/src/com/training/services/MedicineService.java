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
	
	
	public Medicine findById(int id) {
		
		return this.repo.findById(id);
	}
	
}
