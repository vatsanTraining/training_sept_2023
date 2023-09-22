/**
 * 
 */
package com.example.demo;

/**
 * @author vatsan
 * @version 1.0
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Converter conv = new Converter();
		
		 // conv.inrToUsd(args[0]);   args is a string method expects a double 

		System.out.println(conv.convert(Double.parseDouble(args[0])));  // parse string representation of double into double
		 
	}

}
