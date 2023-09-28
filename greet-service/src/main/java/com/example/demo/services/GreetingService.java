package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.ifaces.Greeter;

@Component
public class GreetingService {

	
	// For Greeter Service greeter is a Dependency
	
	
	@Autowired
	private List<Greeter> grtList;
	
	
	@Autowired
	@Qualifier("bday")
	private Greeter bgreeter;
	
	@Autowired
	@Qualifier("wday")
	private Greeter wgreeter;


	
	public GreetingService(List<Greeter> grtList) {
		super();
		this.grtList = grtList;
	}

	//@Autowired    // Constructor DI
	public GreetingService(@Qualifier("bday") Greeter greeter) {
		super();
		this.bgreeter = greeter;
	}
	
	public GreetingService() {
		super();
	}

	public void print(String name) {
		
		System.out.println(bgreeter.greet(name));
		System.out.println(wgreeter.greet(name));
	}

	//@Autowired                 // Setter DI
	public void setGreeter(@Qualifier("bday") Greeter greeter) {
		this.bgreeter = greeter;
	}
	
	public List<Greeter> getGrtList(){
		
		return this.grtList;
	}
}
