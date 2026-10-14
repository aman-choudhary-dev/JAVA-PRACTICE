package com.Encapsulation;

/**
 * Encapsulated account class
 */
public class Account {
	private String accHolderName;
	private String accNo;
	private double balance;

	public Account(String accHolderName, String accNo, double balance) {
		super();
		this.accHolderName = accHolderName;
		this.accNo = accNo;
		this.balance = balance;
	}

	// getter for balance
	public double getBalance() {
		return balance;
	}
	// Transfering funds between two account
	public void fundTransfer( int amount, Account receiver) {
		if (balance > amount) {
			receiver.balance += amount;
			balance -= amount;
		} else {
			System.err.println("Invalid Credentials");
		}
	}
	// setter
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.err.println("Invalid Amount");
		}
	}

	// setter
	public void withdraw(int amount) {
		if (amount > 0 && amount < balance) {
			balance -= amount;
			System.out.println("Amount Debited");
		} else {
			System.err.println("Invalid Amount");
		}
	}


}
