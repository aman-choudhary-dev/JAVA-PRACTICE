package com.Inheritance.BankAccountSystem;

public class FixedDepositAccount extends Account{
	private int fixedInMonth;

	public FixedDepositAccount(String accNO, int fixedInMonth) {
		super(accNO);
		this.fixedInMonth = fixedInMonth;
	}

	@Override
	void withdraw(double amount) {
		System.err.println("This is a Fixed Account");
		System.err.println("Funds are locked for : " + fixedInMonth + " Months");
	}

	public int getFixedInMonth() {
		return fixedInMonth;
	}
	
}
