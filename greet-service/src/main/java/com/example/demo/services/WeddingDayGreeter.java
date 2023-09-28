package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.ifaces.Greeter;

@Service("wday")

public class WeddingDayGreeter implements Greeter {

	@Override
	public String greet(String name) {

		return "Happy Anniversary: =>"+name;
	}

}
