package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.ifaces.Greeter;

@Service("bday")
public class BirthDayGreeter implements Greeter {

	@Override
	public String greet(String name) {

		return "Happy Birthday "+name;
	}

}
