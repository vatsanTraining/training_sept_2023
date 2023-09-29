package com.example.exceptions;

import java.time.LocalDateTime;

public class RangeCheckException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String errorCode;
	private String errorMessage;
	private LocalDateTime dateTime;
	
	public RangeCheckException(String errorCode, String errorMessage, LocalDateTime dateTime) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.dateTime = dateTime;
	}

	@Override
	public String getMessage() {
		return this.errorCode + ","+this.errorMessage+" occured at "+this.dateTime;
	}
	
	
	
}
