package com.example.demo;

public class Converter {

	
	public double convert(double inr) {
		
		return inr/84.00;
	}
	
	//name should be same and argument must change return type is not condition for overloading
	
	public String convert(String name) {
		
		return name.toUpperCase();
	}
	
	// name should be same and argument must change
	public double convert(double number, double exponent) {
		
		return Math.pow(number, exponent);
	}
	
}
