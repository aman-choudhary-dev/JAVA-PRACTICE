package com;

public class Driver {
	public static void main(String[] args) {
		int id[] = new int[5];
		id[0] = 55;
		id[1] = 23;
		id[2] = 64;
		id[3] = 84;
		id[4] = 91;
		System.out.println("ID At : " + id[2]);

//		Account[] accounts = { new Account("Aman", 10000), new Account("Zaid", 15000), new Account("Kumar", 500000), };
//		System.out.println(accounts[0]);
//		System.out.println("Name    : " + accounts[0].name);
//		System.out.println("Balance : " + accounts[0].balance);

		for (int i = 0; i < id.length; i++) { // will go till length of ID array
			// will check for the number greater than 50 in ID array
			if (id[i] > 50) {
				System.out.println("Number Greater than 50 in ID : " + id[i]);
			}
		}
	}
}
