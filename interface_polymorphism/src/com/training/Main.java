package com.training;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc=null;
		
		try {
			int mark = Integer.parseInt(args[0]);
			
			 sc = new Scanner(System.in);
			
			int number = sc.nextInt();
		
			
			System.out.println("Mark Scored:=>"+mark);
		} catch (NumberFormatException e) {
			
		//	throw new RuntimeException("Custom Exception");  // the line below becomes unreachable

			System.err.println("Enter a Number 0-9");
			
			//throw new RuntimeException("Custom Exception");  // throw new exception finally will be called
			
			//throw e;   // throw the caught exception  finally will be called
			
			System.exit(0);  // Academic task
		}
	    finally {
	    	System.out.println("==  INSIDE FINALLY ===");
	    	sc.close();
	    }
		System.out.println("Bye !");
	}

}
