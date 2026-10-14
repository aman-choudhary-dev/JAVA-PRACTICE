package com.Encapsulation;
/**
 * Class for Smart Phone Lock System
 */
public class PhoneLock {
	// Data hiding using private fields
	private String pin;
	private boolean isLocked = true;
	public PhoneLock(String pin) {
		super();
		this.pin = pin;
	}
	// PIN verification to unlock the phone
	public void unlock(String enteredPin) {
		if(enteredPin.equals(pin)) {
			isLocked = false;
			System.out.println("Phone Unlocked Successfully");
		}else {
			System.err.println("Incorrect Pin!");
		}
	}
	public void lock() {
		isLocked = true;
	}
	public void checkStatus() { //status checking
		if(isLocked) {
			System.out.println("Phone Status : Locked");
		}else {
			System.err.println("Phone Status : Unlocked");
		}
	}
}
