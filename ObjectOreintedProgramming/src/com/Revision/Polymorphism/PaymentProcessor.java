package com.Revision.Polymorphism;
/**
 * THis class HElp us call the right method of object without much implementation
 */
public class PaymentProcessor {
	void paymentProcessor(Account account) {
		account.processingPayment();
	}
}
