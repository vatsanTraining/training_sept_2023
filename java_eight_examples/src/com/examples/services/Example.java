package com.examples.services;

import java.util.function.Predicate;

public class Example implements Predicate<String> {

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		
		Predicate<String> ex = new Example();
	}
}
