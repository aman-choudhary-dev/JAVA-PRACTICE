package com.Revision.Encapsulation;

public class Driver {
	public static void main(String[] args) {
		Account account = new Account();
		account.credit(5000 , "adw");
		// account.balance = 12000; // we won't be able to change the data since we have acheived encapsulation
	}
	
}
