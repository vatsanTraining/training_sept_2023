package com.training;

public class Greeting {

	public String getMessage() {
		
		return "Welcome to Java Programming";
	}
	
	// overloaded method name remains same but argument changes
	
	public String getMessage(String name) {
		
		return name + " Welcome to Java Programming";
		
	}
	
	public void greet() {
		
		System.out.println("Hello world");
		
	}
}
