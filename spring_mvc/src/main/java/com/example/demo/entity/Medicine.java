package com.example.demo.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Medicine {

	 private int id;
	 private String medicineName;
	 private String genericName;
	 private double ratePerUnit;
	 private LocalDate dateOfMfg;
	
	
}
