package com.example.demo.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.ifaces.Calculate;

@Component
//@Lazy(value = false)
@Scope("prototype")
public class CurrencyConverter implements Calculate<Double,Double> {


	
	

	public CurrencyConverter(@Value("${author.name}") String author) {
		super();
		System.out.println("Currency Converter Called ============"+author);

	}

	@Override
	public Double calculate(Double inr) {
		
System.out.println("ARgument :=>"+inr);

		return inr * 50;
	}

}
