package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.demo.exceptions.ErrorHandler;

@RestControllerAdvice
public class ExceptionAdvice {

	
	
	
	@ExceptionHandler(value = Exception.class)
	public ErrorHandler handleAllException(Exception ex, WebRequest req) {
		
		return new ErrorHandler("ERR-101",ex.getMessage(), req.getDescription(false), LocalDateTime.now());
		
	
	}
	
	
}
