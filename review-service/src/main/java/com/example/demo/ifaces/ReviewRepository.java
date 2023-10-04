package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.MedicineReview;

public interface ReviewRepository extends JpaRepository<MedicineReview, Integer> {

}
