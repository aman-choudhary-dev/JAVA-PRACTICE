package com.Inheritance.BankAccountSystem;
/**
 * Account class which is abstract 
 */
abstract class Account {
	private String accNO;
	private String accHolderName;
	protected double balance;
	public Account(String accNO) {
		super();
		this.accNO = accNO;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccNO() {
		return accNO;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}else {
			System.err.println("Invalid Amount");
		}
	}
	abstract void withdraw(double amount);
}
