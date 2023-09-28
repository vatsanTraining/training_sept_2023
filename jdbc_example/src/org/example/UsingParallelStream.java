package org.example;

import java.util.Arrays;
import java.util.List;

public class UsingParallelStream {

	public static void main(String[] args) {

		
		List<String> names = Arrays.asList("Ram","Shyam","Vicky","Ganesh","Kumaresh","Yash","Zahir");
	
		
		names.stream().forEach(System.out::println);
		
		
		System.out.println("Using Parallel Stream");
		
		
		names.parallelStream().forEach((e) ->{
			
			System.out.println(e);
		});
	
	
	}

}
