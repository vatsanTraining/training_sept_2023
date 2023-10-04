package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.entity.MedicineReview;
import com.example.demo.ifaces.ReviewRepository;
import com.example.demo.services.ReviewService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/reviews")

@AllArgsConstructor
public class ReviewController {

	  
	  private ReviewService service;
	  
	  
	  @GetMapping("/{id}")
	  public MedicineReview getById(@PathVariable int id) {
		  
		  return this.service.findById(id);
	  }
	  
	  @GetMapping("/srch/name/{name}")
	  public List<MedicineReview> getByName(@PathVariable("name") String  name) {
		  
		  return this.service.findByMedicineName(name);
	  }
	
	  @GetMapping("/srch/rating/{rating}")
	  public List<MedicineReview> getByRating(@PathVariable("rating") double rating) {
		  
		  return this.service.findByRatingGrtThan(rating);
	  }
	
	  @GetMapping
	  public List<MedicineReview> findAll() {
		  
		  return this.service.findAll();
	  }
	  
	  @PostMapping
	  public ResponseEntity<Object> save(@RequestBody MedicineReview entity){
		  
		   MedicineReview addedElement = this.service.save(entity);
		   
		   URI location = 
				    ServletUriComponentsBuilder
				        .fromCurrentRequest()
				        .path("/{id}")
				        .buildAndExpand(entity.getReviewId())
				        .toUri();
		   
		   return ResponseEntity.created(location).body(addedElement);
	  }
	  
  	  
	  @PutMapping
	  public ResponseEntity<Object> update(@RequestBody MedicineReview entity){
	
		   MedicineReview updatedElement = this.service.update(entity);

		   return ResponseEntity.status(200).body(updatedElement);

	  }

	  @PatchMapping(path = "/{id}/{newRating}")
	  public ResponseEntity<Object> updateRating(@PathVariable double newRating, @PathVariable int id){
		  
		  int rowUpdated = this.service.updateRating(newRating, id);
		  
		  return ResponseEntity.ok(rowUpdated+" :Updated");
	  }

	  
	  @DeleteMapping
	  public ResponseEntity<Object> remove(@RequestBody MedicineReview entity){
	
		   MedicineReview deletedElement = this.service.remove(entity).orElseThrow(() -> new RuntimeException("Element Not Found"));

		   return ResponseEntity.status(200).body(deletedElement);

	  }

}
