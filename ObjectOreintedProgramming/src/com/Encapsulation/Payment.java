package com.Encapsulation;

/**
 * Encapsulated class for payment
 */
public class Payment {
	private int balance; // set as private so that other class won't be able to modify the data

	public Payment(int balance) {
		super();
		this.balance = balance;
	}

	// providing getter to get the data
	public int getBalance() {
		return balance;
	}

	// doCredit and doDebit are setter for the data they only will be able to modify
	// the data
	public void doDebit(int amount) {
		balance = balance - amount;
	}

	public void doCredit(int amount) {
		balance = balance + amount;
	}
}
