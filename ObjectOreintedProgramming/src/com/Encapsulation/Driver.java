package com.Encapsulation;

public class Driver {
	public static void main(String[] args) {
		Payment payment = new Payment(2500);
		System.out.println(payment.getBalance());
		payment.doCredit(1500);
		payment.doDebit(2500);
		System.out.println(payment.getBalance());
	}
}
