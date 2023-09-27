package com.example.demo;

import java.io.IOException;

public class Task  implements Runnable{

	@Override
	public void run() {

		System.out.println("Start Reading ");
		
		
		   try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished Reading");
	}

}
