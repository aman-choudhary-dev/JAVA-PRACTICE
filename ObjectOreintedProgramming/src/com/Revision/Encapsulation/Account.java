package com.Revision.Encapsulation;

public class Account {
	// -> Encapsulation
	private int balance; // making the data private so that the other classes won't be able to access it

	public void credit(int amount, String senderPin) {
		// will check if the sender is sending the valid amount or not
		// check the pin of sender before crediting and debiting the amount
		if (amount > 0 && validatePin(senderPin)) {
			balance += amount;
			System.out.println("Balance Updated");
		}
	}

	public int getBalance() {
		return balance;
	}

	// Abstraction
	// Hiding the core implementation of our program while exposing only the
	// required functionality
	private boolean validatePin(String userPin) {
		System.out.println("Account Validated");
		return true;
	}
}
