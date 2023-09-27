package com.example.demo;

import java.io.Serializable;
import java.lang.annotation.Annotation;

import com.example.demo.stereotype.Component;
import com.example.demo.stereotype.Table;

@Table(tableName = "creditcard")
@Component(componentName = "card")
public class CreditCard implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 125L;
	
	private int cardNumber;
	private String cardHolderName;
	private double creditLimit;
	private transient int cvv;
	
	public CreditCard() {
		super();
		
		Annotation[] list = this.getClass().getAnnotations();
		
		for(Annotation eachAnnotation:list) {
			System.out.println("annotations"+eachAnnotation.getClass().getName());
		}
	}
	
	public CreditCard(int cardNumber, String cardHolderName, double creditLimit, int cvv) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.creditLimit = creditLimit;
		this.cvv = cvv;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName + ", creditLimit="
				+ creditLimit + "]";
	}
	
}
