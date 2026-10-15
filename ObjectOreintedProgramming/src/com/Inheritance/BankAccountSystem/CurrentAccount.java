package com.Inheritance.BankAccountSystem;

public class CurrentAccount extends Account{
	private int overDraftLimit;

	public CurrentAccount(String accNO, int overDraftLimit) {
		super(accNO);
		this.overDraftLimit = overDraftLimit;
	}
	@Override
	void withdraw(double amount) {
		double leftBalance = balance - amount;
		if(amount > 0 && leftBalance >= overDraftLimit) {
			balance -= amount;
			System.out.println("Withdraw Successfull");
			System.out.println("Updated Balance : " + balance);
		}else {
			System.out.println("Exceeding the overdraft limit");
		}
	}
}
