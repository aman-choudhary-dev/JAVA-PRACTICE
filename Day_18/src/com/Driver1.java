package com;

public class Driver1 {
	public static void main(String[] args) {
		Account []accounts = {
				new Account("Aman" , 5000 , "61635198"),
				new Account("Rahul" , 1500, "56158468"),
				new Account("Akash" , 2000 , "3546165"),
				new Account("Suman" , 51681 , "45684525"),
				new Account("Rohit" , 1201 , "56815685"),
				new Account("Rupesh" , 678 , "351465156468"),
		};
		accountsWithLowBalance(accounts);
	}
	static void accountsWithLowBalance(Account accounts[]) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].balance  < 2000) {
				System.out.println("Account with low balance : " + accounts[i].name);
			}
		}
	}
}
