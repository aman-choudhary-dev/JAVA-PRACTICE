package com.Inheritance.BankAccountSystem;

public class Driver {
	public static void main(String[] args) {
		Account a1 = new SavingAccount("68498464984", 12);
		a1.deposit(5000);
		a1.withdraw(5000);
		System.out.println(a1.getBalance());
		
		Account a2 = new FixedDepositAccount("5498464566", 14);
		a2.withdraw(0);
		
		Account a3 = new CurrentAccount("359861968", -5000);
		a3.deposit(5000);
		System.out.println(a3.getBalance());
		a3.withdraw(11000);
	}
}
