package com.training.utils;

import java.util.Comparator;

import com.training.model.Medicine;

public class IdComparator implements Comparator<Medicine> {

	@Override
	public int compare(Medicine o1, Medicine o2) {
		
		if( o1.getId() > o2.getId()) return 1;
		
		if(o1.getId()<o2.getId()) return -1;
		
		return 0;
		
	}

}
