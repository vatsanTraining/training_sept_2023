package com.example.demo;

public class Application {

	public static void main(String[] args) {

		//CountingService service = new CountingService();
		
		//service.countNumbers(10);
		
		
		new UseCountingService(10, "Ten Counter");
		
		new UseCountingService(100, "Hundred Counter");

		new UseCountingService(5000, "Five thousand Counter");

	}

}
