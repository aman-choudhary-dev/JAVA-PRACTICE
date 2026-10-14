package com.Encapsulation;

public class PhoneUser {
	public static void main(String[] args) {
		PhoneLock ph1 = new PhoneLock("5816");
		ph1.checkStatus();
		ph1.unlock("5816");
		ph1.lock();
		ph1.checkStatus();
	}
}
