package com.example.demo.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Data;


@Data
public class MedicineDto {

	 private int id;
	 private String medicineName;
	 private String genericName;
	 private double ratePerUnit;
	 @DateTimeFormat(iso = ISO.DATE)
	 private LocalDate dateOfMfg;

}
