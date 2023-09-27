package com.training.services;

import java.util.Comparator;

import com.training.model.Medicine;

public class RatePerUnitComparator implements Comparator<Medicine> {

	@Override
	public int compare(Medicine o1, Medicine o2) {
		
		
		if(o1.getRatePerUnit() < o2.getRatePerUnit()) return 1;
		if(o1.getRatePerUnit() > o2.getRatePerUnit()) return -1;
		return 0;
	}

}
