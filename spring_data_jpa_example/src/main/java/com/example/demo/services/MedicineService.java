package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Medicine;
import com.example.demo.repos.MedicineRepository;
import com.example.exceptions.ElementNotFoundException;


@Service
public class MedicineService {

	private MedicineRepository repo;

	public MedicineService(MedicineRepository repo) {
		super();
		this.repo = repo;
		
		System.out.println(repo.getClass().getName());
	}
	
	
	public List<Medicine> findAll(){
		
		return this.repo.findAll();
	}
	
	public Medicine findById(int id)  throws ElementNotFoundException{
		
		return this.repo.findById(id)
				  .orElseThrow(() -> new ElementNotFoundException("Element with Id "+ id +"Not Found"));
		
	}
	
	public Medicine add(Medicine entity) {
		
		return this.repo.save(entity);
	}
	
	public void remove(int id) {
		
		this.repo.deleteById(id);
	}
}
