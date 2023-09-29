package com.example.exceptions;

public class ElementNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
