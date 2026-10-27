package com.Revision.Polymorphism;

public class Driver1 {
	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		paymentProcessor.paymentProcessor(new SavingsAccount());
	}
}
