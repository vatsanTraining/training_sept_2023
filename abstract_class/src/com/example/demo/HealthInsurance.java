package com.example.demo;

public class HealthInsurance extends Insurance {
	
	
	

	private int age;
	 private boolean preExistingDisease;

	 
	 
	public HealthInsurance(int policyNumber, double policyAmount, int age, boolean preExistingDisease) {
		super(policyNumber, policyAmount);
		this.age = age;
		this.preExistingDisease = preExistingDisease;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public boolean isPreExistingDisease() {
		return preExistingDisease;
	}



	public void setPreExistingDisease(boolean preExistingDisease) {
		this.preExistingDisease = preExistingDisease;
	}



	@Override
	public double calculatePremium() {
		
		  double premium =5000.00;
		  
		 if(age<50) {
			 premium = 4000;
		 }
		return premium;
	}

}
