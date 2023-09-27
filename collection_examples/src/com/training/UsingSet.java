package com.training;
import java.util.*;

import com.training.exceptions.RangeCheckException;
import com.training.model.Medicine;
import com.training.utils.IdComparator;
public class UsingSet {

	public static void main(String[] args) {

		
		//Set<Medicine> list = new HashSet<>();
		
		Set<Medicine> list = new TreeSet<>();

		//Set<Medicine> list = new TreeSet<>(new IdComparator());

		try {
		
			System.out.println("Is Added :=>" +list.add(new Medicine(201, "Crocin", "Paraceptamal", 34, false)));
			System.out.println("is Added :=>"+list.add(new Medicine(101, "Crocin", "Paraceptamal", 34, false)));
			System.out.println("is Added:=>"+list.add(new Medicine(102, "Gelusil", "Anatacid", 44, false)));

			
			System.out.println(list);
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
		
	}

}
