package com.example.demo;

public class CountingService {

	public CountingService() {
		super();
	}

	
	public void countNumbers(int countTo) {
		
		int sum =0;
		
		for(int i=0;i<=countTo;i++) {
			
			sum+=i;
		}
		
		System.out.println("Thread :=>"+Thread.currentThread().getName() + "=>Count :=>"+ sum);
	}
}
