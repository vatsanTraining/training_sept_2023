package com.example.exceptions;

public class ElementNotFoundException extends Exception {

	private String message;

	public ElementNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
	
	
}
