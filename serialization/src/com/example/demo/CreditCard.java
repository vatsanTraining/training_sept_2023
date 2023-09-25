package com.example.demo;

import java.io.Serializable;

import com.example.demo.stereotype.Table;

@Table(tableName = "creditcard")
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
