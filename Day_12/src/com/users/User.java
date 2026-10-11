package com.users;

public class User {

	String accNo;
	String userName;
	private String pin;
	private int balance;

	public User(String accNo, String userName, String pin, int balance) {
		this.accNo = accNo;
		this.userName = userName;
		this.pin = pin;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}

	public String getUsername() { // this method is to access the name outside of package because they are default
		return userName;
	}

	public int getBalance() { // To access the balance outside of the class
		return balance;
	}

	public void displayAccInfo() { // to show info
		System.out.println(accNo + " " + userName + " " + balance);
	}

	public void deposit(int amount, String enteredPin) { // for depositing money
		if (enteredPin.equals(pin) && amount > 0) {
			balance += amount;
			System.out.println("Amount Deposited");
		}
	}

	public void withdraw(int amount, String enteredPin) { // for withdrawing the money from account
		if (enteredPin.equals(pin) && amount > 0 && amount <= balance) {
			balance -= amount;
		}else {
			System.err.println("Wrong Pin");
		}
	}

	public void transferBalance(User receiver, int amount, String senderPin) {
		if (senderPin.equals(pin) && amount > 0 && amount <= balance) {
			balance -= amount;
			receiver.balance += amount;
			System.out.println("Sender Balance : " + balance);
			System.out.println("Receiver Balance Updated : " + receiver.balance);
			return;
		}
		System.out.println("Enter Valid Account Number , Amount , Pin ");
	}
	public void changePin(String oldPin , String newPin) {
		if(pin.equals(oldPin)) {
			if(newPin.length() < 4) {
				System.err.println("Pin must contain atleast 4 characters ");
			}else {
				pin = newPin;
				System.out.println("Successfully Pin Changed");
				return;
			}
		}
		System.err.println("Enter Correct Password");
	}
}
