package com.example.demo;

public class VechcileInsurance extends Insurance {
	
	private String modelName;
	

	public VechcileInsurance(int policyNumber, double policyAmount, String modelName) {
		super(policyNumber, policyAmount);
		this.modelName = modelName;
	}


	@Override
	public double calculatePremium() {
		
		switch (modelName.toLowerCase()){
		
		case "pulsar":
			return 1000;
		case "bullet":
		    return 2000;
		default:
			return 3000;
		}
	}

}
