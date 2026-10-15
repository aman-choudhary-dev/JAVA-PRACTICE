package com.Inheritance;
// Extend means ' Is A ' relationship
public class SavingAccount extends Account {
	public void openSavingAccount(String name , String address, String type) {
		// Reusing the existing code of Account class
		openBankAccount(name, address, type);
	}
}
