package org.example.demo.services;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
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
	
	
	public Set<Medicine> getMedicineByCondition(Predicate<Medicine> condi){
		
		 		return this.findAll()
				 .stream()
				 .filter(condi).collect(Collectors.toSet());

	}
			
	
	
	public Map<String,Double> getMedicineNameAndPrice(double rpu){
		
		Function<Medicine, String> mapper1 = (medicine) -> medicine.getMedicineName();
		Function<Medicine, Double> mapper2 = (medicine) -> medicine.getRatePerUnit();

		
		Collectors.toMap(mapper1, mapper2);
		
//		return this.findAll()
//				.stream()
//				.filter(e -> e.getRatePerUnit()>rpu)
//				.collect(Collectors.toMap(Medicine::getMedicineName, Medicine::getRatePerUnit));
//	
		return this.findAll()
				.stream()
				.filter(e -> e.getRatePerUnit()>rpu)
				.collect(Collectors.toMap(mapper1, mapper2));
		

	}
	
	public Set<Medicine> topN(int number){
		
		
		//return this.findAll().stream().limit(number).collect(Collectors.toSet());
		
		Comparator<Medicine> comp = Comparator.comparing(Medicine::getRatePerUnit);
		
		//return this.findAll().stream().sorted(comp).limit(number).collect(Collectors.toSet());
		
		return this.findAll().stream().sorted(comp.reversed()).limit(number).collect(Collectors.toSet());

	}
	
	public double findItemwithMaxPrice() {
		
		Comparator<Medicine> comp = Comparator.comparing(Medicine::getRatePerUnit);

		Optional<Medicine>  option = this.findAll().stream().max(comp);
		
//		 if(option.isPresent()) {
//			 return option.get().getRatePerUnit();
//		 } else {
//		    return 0.0;
//		 }
		 
		 Medicine found = option.orElseThrow( () -> new RuntimeException("Max value Not found"));
	
		  return found.getRatePerUnit();
	}
}
