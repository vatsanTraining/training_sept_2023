package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.MedicineReview;

import jakarta.transaction.Transactional;

public interface ReviewRepository extends JpaRepository<MedicineReview, Integer> {

	List<MedicineReview> findByReviewedProduct(String prdName);   //DSL  Domain Specific Language

	@Query(value = "select * from medicine_review where rating>:rating",nativeQuery = true)   //SQL
	
	List<MedicineReview> getDetailsRating(@Param("rating") double rating);

	//JPQL uses className and property name instead of Table Name and ColumnName
	
	@Query(value = "update MedicineReview set rating=:newRating where reviewId=:id",nativeQuery = false)
	@Modifying
	@Transactional
	int  updateRating(@Param("newRating") double newRating, @Param("id") int id);
	
}