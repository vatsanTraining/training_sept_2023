package com.training;
import java.util.*;

import com.training.exceptions.RangeCheckException;
import com.training.model.Medicine;
public class UsingMap {

	public static void main(String[] args) {

		
		
		HashMap<String, Medicine> list = new HashMap<>();
		
		
	  try {
		System.out.println(list.put("fever",new Medicine(201, "Crocin", "Paraceptamal", 34, false))) ;
			
		  System.out.println(list.put("antacid",new Medicine(102, "Gelusil", "Anatacid", 44, false)));
			
		  System.out.println(list.put("antacid",new Medicine(102, "Digiene", "Anatacid", 44, false)));

		   System.out.println(list.get("fever"));
		   

		   for( Map.Entry<String, Medicine> eachItem :list.entrySet()) {
			   
			   System.out.println(eachItem.getKey());
			   System.out.println(eachItem.getValue());
		   }
		   
	} catch (RangeCheckException e) {
		e.printStackTrace();
	}
	}

}
