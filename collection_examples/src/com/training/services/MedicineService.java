package com.training.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.ifaces.CrudRepository;
import com.training.model.Medicine;
import com.training.utils.IdComparator;

public class MedicineService {
	
	private CrudRepository<Medicine> repo;

	
	public MedicineService(CrudRepository<Medicine> repo) {
		super();
		this.repo = repo;
	}
	
	
	public boolean add(Medicine obj) {
		
		return this.repo.add(obj);
	}
	
	public List<Medicine> findAll(){
		
		return this.repo.findAll();
	}
	
	public List<Medicine> sortByProp(String prop){
		
		if(prop.equals("medicineName")) {
			
			Collections.sort(this.repo.findAll());
		} else {
			Collections.sort(this.repo.findAll(),comparatorFactory(prop));
		}
		
		return this.repo.findAll();
	}
	
	private Comparator<Medicine> comparatorFactory(String key){
		
		switch (key) {
		case "id":
			return new IdComparator();
		case "rpu":
		  return new RatePerUnitComparator();
		default:
			return null;
		}
	}
}
