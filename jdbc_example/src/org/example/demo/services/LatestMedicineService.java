package org.example.demo.services;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
	
	public List<Medicine> getMedicineGrtThan(double rpu){
		
		return this.findAll()
				 .stream()
				 .filter(e -> e.getRatePerUnit()>rpu).collect(Collectors.toList());
		
	}
	
	
	public List<Medicine> getMedicineByCondition(Predicate<Medicine> condi){
		
		return null;
	}
			
	
	
	public Map<String,Double> getMedicineNameAndPrice(double rpu){
		
		return this.findAll()
				.stream()
				.filter(e -> e.getRatePerUnit()>rpu)
				.collect(Collectors.toMap(Medicine::getMedicineName, Medicine::getRatePerUnit));
	}
}
