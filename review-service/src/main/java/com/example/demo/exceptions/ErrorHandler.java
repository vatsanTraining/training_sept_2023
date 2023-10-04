package com.example.demo.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorHandler  {

	
	private String errorCode;
	private String errorMessage;
	private String errorUrl;
	private LocalDateTime time;
	
	
	
	
}
