package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Medicine;


public interface MedicineRepository extends JpaRepository<Medicine, Integer> {

}
