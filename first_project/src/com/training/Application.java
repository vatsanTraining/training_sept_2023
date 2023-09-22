package com.training;

public class Application {

	public static  void main(String[] args) {
		
		Greeting grtObj = new Greeting();
		
		System.out.println(grtObj.getMessage());
		
		SimpleInterest simpleInterest = new SimpleInterest();
		
		System.out.println(simpleInterest.calculateInterest(5000, 0.12, 2));
		
		simpleInterest.calculateInterest(20000, 0.13, 2);
		
		String response =grtObj.getMessage();
		
		System.out.println(response);
		
		System.out.println(grtObj.getMessage(args[0]));
	}
}
