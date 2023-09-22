package com.training.model;

public class PostGraduateStudent extends Student {

	
	private String guideName;

	public PostGraduateStudent() {
		super();
	}

	public PostGraduateStudent(int rollNumber, String firstName, String guideName) {
		super(rollNumber, firstName);		
		this.guideName = guideName;
	}

	public String getGuideName() {
		return guideName;
	}

	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	
	

	@Override
	public String toString() {
		return  super.toString() +"PostGraduateStudent [guideName=" + guideName + "]";
	}
	
	
	
}
