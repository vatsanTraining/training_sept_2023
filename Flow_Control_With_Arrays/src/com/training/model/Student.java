package com.training.model;

import java.util.Objects;

public class Student {

	private int rollNumber;
	private String firstName;
	
	
	public Student() {
		super();
	
	}
	public Student(int rollNumber, String firstName) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && rollNumber == other.rollNumber;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + "]";
	}
	
	
}
