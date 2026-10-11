package com.Accounts;

public class Users{
	String accNo;
	String userName;
	private String pin;
	private int balance;
	public Users(String accNo , String userName , String pin ,int balance){
		this.accNo = accNo;
		this.userName = userName;
		this.pin  = pin;
		this.balance = balance;
	}
	public void displayAccInfo(){
		System.out.println(accNo + " " + userName + " " + balance);
	}
	
	public void deposit(int amount , String enteredPin){
		if(enteredPin.equals(pin) && amount > 0){
			balance += amount;
		}
	}
	
	public void withdraw(int amount , String enteredPin){
		if(enteredPin.equals(pin) && amount > 0 && amount < balance){
			balance -= amount;
		}
	}
	
}