package org.example.demo.services;

import org.example.demo.ifaces.MedicineRepository;

import com.example.exceptions.ElementNotFoundException;
import com.example.ifaces.CrudRepository;
import com.training.model.Medicine;
import com.training.services.MedicineService;

public class LatestMedicineService extends MedicineService {

	private MedicineRepository repo;

	public LatestMedicineService(MedicineRepository repo) {
		super(repo);
		
		this.repo = repo;
	}

	public int remove(int id) throws ElementNotFoundException {
		
		return this.repo.removeById(id);
	}
	
	public Medicine findById(int id) throws ElementNotFoundException {
		
		return this.repo.findById(id);
	}
}
