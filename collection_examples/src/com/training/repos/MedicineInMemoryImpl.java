package com.training.repos;

import java.util.ArrayList;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.training.model.Medicine;

public class MedicineInMemoryImpl implements CrudRepository<Medicine> {
	
	private List<Medicine> list;
	
	
	public MedicineInMemoryImpl() {
		super();
		this.list = new ArrayList<Medicine>();
	}

	public MedicineInMemoryImpl(List<Medicine> list) {
		super();
		this.list = list;
	}
	
	@Override
	public boolean add(Medicine obj) {
		
		return this.list.add(obj);
	}

	@Override
	public List<Medicine> findAll() {
		return this.list;
	}

}
