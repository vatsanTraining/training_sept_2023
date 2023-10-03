package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Medicine;
import com.example.demo.ifaces.MedicineRepository;

@Service
public class MedicineService {

	
	private MedicineRepository repo;

	public MedicineService(MedicineRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public Medicine add(Medicine entity) {
		
		return this.repo.save(entity);
	}
	
	
	public List<Medicine> findAll(){
		
		return this.repo.findAll();
	}
}
