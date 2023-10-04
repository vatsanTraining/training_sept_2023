package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "medicine_review")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MedicineReview {

	@Id
	@Column(name = "review_id")
	int reviewId;
	
	@Column(name = "reviewed_product")
	String reviewedProduct;
	
	@Column(name = "review_text")
	String reviewText;
	
	@Column(name = "rating")
	double rating;
	
}
