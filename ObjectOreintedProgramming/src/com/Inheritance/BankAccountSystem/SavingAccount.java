package com.Inheritance.BankAccountSystem;
/**
 * Class For Savings Account will over ride the abstract method and add it own method to calculate interest
 */
public class SavingAccount  extends Account{
	private int interest;

	public SavingAccount(String accNO, int interest) {
		super(accNO);
		this.interest = interest;
	}
	@Override // used to show that we're overriding the method
	void withdraw(double amount) {
		double leftBalance = balance - amount;
		if(amount >  0 && leftBalance >= 1000) {
			balance -= amount;
			System.out.println("Withdraw Successfully");
		}else if (amount < 0){
			System.err.println("Invalid Amount");
		}else {
			System.err.println();
		}
	}
	void addInterest() {
		System.out.println("Interest added : " + balance* interest/100);
		balance += balance* interest/100;
		System.out.println("Updated Balance : " + balance);
	}
}
