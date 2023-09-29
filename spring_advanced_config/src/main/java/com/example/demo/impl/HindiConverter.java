package com.example.demo.impl;

import java.util.HashMap;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.ifaces.Calculate;

@Component
@Primary
public class HindiConverter implements Calculate<String, String> {

	private HashMap<String,String> map;

	public HindiConverter() {
		super();
		
		
		this.map = new HashMap<>();
		
		this.map.put("water", "paani");
		
		this.map.put("rice", "chawal");

		this.map.put("rain", "baarish");

	}

	@Override
	public String calculate(String t) {
		return this.map.get(t);
	}
	
	
	

}
