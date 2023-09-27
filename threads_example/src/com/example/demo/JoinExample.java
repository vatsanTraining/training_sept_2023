package com.example.demo;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Main Started");
		
		Thread thread = new Thread(new Task());
		
		
		try {
			thread.start();

			thread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Main Finished");
	}

}
