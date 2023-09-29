package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.ifaces.Calculate;

@Service
@Lazy(value = false)
public class ConverterService<T, R> {

	
	private Calculate<T, R> calculator;
	
	

	@Autowired
	public ConverterService(@Qualifier("currencyConverter") Calculate<T, R> calculator) {
		super();
		this.calculator = calculator;
	}
	
	
	public Object find(T obj) {
		
		return this.calculator.calculate(obj);
	}
}
