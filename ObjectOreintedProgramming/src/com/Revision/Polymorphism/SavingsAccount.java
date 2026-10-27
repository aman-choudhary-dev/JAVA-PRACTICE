package com.Revision.Polymorphism;

public class SavingsAccount  extends Account{
	@Override
	void processingPayment() {
		System.out.println("Processing Savings Accout Payment");
	}
}
