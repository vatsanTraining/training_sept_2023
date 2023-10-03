package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Component
@Entity
@Table(name = "medicine_2023")
public class Medicine {

	 @Id
	 private int id;
	 
	 @Column(name = "medicine_name",length = 45)
	 private String medicineName;
	 
	 @Column(name = "generic_name",length = 45)
	 private String genericName;
	 
	 @Column(name = "rate_per_unit")
	 private double ratePerUnit;
	 
	 @Column(name = "date_of_mfg")
	 @DateTimeFormat(iso = ISO.DATE)
	 private LocalDate dateOfMfg;
	
	
}
