package com.example.demo;

public class UseCountingService implements Runnable {
	
	private CountingService service;
	private int countTo;
	private String threadName;
	
	

	public UseCountingService(int countTo, String threadName) {
		super();
		
		this.countTo = countTo;
		
		this.threadName = threadName;
		
		this.service = new CountingService();
		
		Thread thread = new Thread(this,threadName);  //new 
		
		thread.start();   //runnable
	}



	@Override
	public void run() {   // running

		this.service.countNumbers(countTo);
	}  //Dead

}
