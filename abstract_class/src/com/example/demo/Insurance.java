package com.example.demo;

public abstract class Insurance {

	private int policyNumber;
	private double policyAmount;
	
	public Insurance(int policyNumber, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyAmount = policyAmount;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	public abstract double calculatePremium() ;
	
}
