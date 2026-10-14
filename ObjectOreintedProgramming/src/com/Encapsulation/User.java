package com.Encapsulation;
/**
 * User class for practicing encapsulation
 */
public class User {
	public static void main(String[] args) {
		Account account1 = new Account("Aman", "48654151684", 85002.25);
		Account account2 = new Account("Zaid", "54684151684", 50000);
		System.out.println(account1.getBalance());
		account1.deposit(-500); // will throw invalid amount
		account1.deposit(12000);
		account1.fundTransfer( 5000, account2);
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
	}
}
