package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.MedicineReview;
import com.example.demo.ifaces.ReviewRepository;


@Service
public class ReviewService {

	
	private ReviewRepository repo;

	

	public ReviewService(ReviewRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public MedicineReview save(MedicineReview entity) {
		
		return this.repo.save(entity);
	}
	
	public MedicineReview findById(int id) {
		
		return this.repo.findById(id)
				.orElseThrow(() -> new RuntimeException("Id with Number"+ id + "not found"));
	}
	
	public List<MedicineReview> findAll(){
		
		
		return this.repo.findAll();
		
		}
	
	public MedicineReview update(MedicineReview entity) {
		
		return this.repo.save(entity);
	}
	
	public Optional<MedicineReview> remove(MedicineReview entity) {
		
		Optional<MedicineReview> deleted = Optional.empty();
		
		if(this.repo.existsById(entity.getReviewId())) {
			
			this.repo.delete(entity);
			
			deleted = Optional.of(entity);
		} 
		
		return deleted;
	}

	
	public List<MedicineReview> findByMedicineName(String medicineName){
		
		return this.repo.findByReviewedProduct(medicineName);
	}
	
	public List<MedicineReview> findByRatingGrtThan(double rating){
		
		return this.repo.getDetailsRating(rating);
	}
	
	public int updateRating(double newRating,int id) {
		
		return this.repo.updateRating(newRating, id);
	}
}
