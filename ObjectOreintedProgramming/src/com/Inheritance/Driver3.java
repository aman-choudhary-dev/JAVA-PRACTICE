package com.Inheritance;
/**
 * MultiLevel Inheritance
 */
class Account1 {
	void openAccount(String id , String eMail) {
		System.out.println("Account.OpenAccount()");
	}
}

class SavingAccount1 extends Account1 {
	@Override
	void openAccount(String id , String eMail) {
		System.out.println("SavingAccount.OpenAccount()");
	}
}

class SrCitAccount extends SavingAccount1 {
	@Override
	void openAccount(String id , String eMail) {
		System.out.println("SrCitAccount.OpenAccount()");
	}
}

class PensionAccount extends SrCitAccount {
	@Override
	void openAccount(String id , String eMail) {
		System.out.println("PensionAccount.OpenAccount()");
	}
}

public class Driver3 {
	public static void main(String[] args) {
		PensionAccount p = new PensionAccount();
		p.openAccount("adadw", "adawdaw@gmail.com");
	}
}
