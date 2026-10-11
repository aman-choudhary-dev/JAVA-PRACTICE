package com.Bank;

import java.util.Scanner;

import com.users.Transaction;
import com.users.User;

public class BankSystem {
	public static void main(String a[]) {
		Scanner sc = new Scanner(System.in);
		User u1 = new User("85269638", "Aman Choudhary", "1789", 80000);
		User u2 = new User("85846841", "Rahul Tiwari", "1456", 10000);
		User u3 = new User("85561351", "Eklavya Bhism", "1234", 20000);
		User[] users = { u1, u2, u3 };
		int choice = 0;
		while (choice != 9) {
			System.out.println("=====Bank System Started======");
			System.out.println(
					"1. Display Account\n2. Deposit\n3. Withdraw\n4. Transfer\n5. Change PIN\n6. Find Account\n7. Highest Balance\n8. Transaction History\n9. Exit\nEnter choice:");
			choice = sc.nextInt();
			if (choice == 1) {
				displayAccounts(users);
			} else if (choice == 2) {
				deposit(sc, users);
			} else if (choice == 3) {
				withdraw(sc, users);
			} else if (choice == 4) {
				transfer(sc, users);
			} else if (choice == 5) {
				changePin(users, sc);
			} else if (choice == 6) {
				findAccount(users, sc);
			} else if (choice == 7) {
				highestBalanceUser(users);
			} else if (choice == 8) {
				Transaction.displayAllHistory();
			} else if (choice == 9) {
				break;
			} else {
				System.err.println("Enter Valid Choice");
			}
		}
		System.out.println("Bank System Closed");
	}

	static void changePin(User[] users, Scanner sc) {
		User target = findAccount(users, sc);
		System.out.println("Enter Old Pin");
		String oldPin = sc.next();
		System.out.println("Enter New Pin");
		String newPin = sc.next();
		if (target == null) {
			System.err.println("Account not found");
			return;
		}
		target.changePin(oldPin, newPin);
	}

	static void transfer(Scanner sc, User[] users) {
		System.out.println("Enter Sender Detail");
		User sender = findAccount(users, sc);
		if (sender == null) {
			System.err.println("Account not found");
			return;
		}
		System.out.println("Enter Pin");
		String pin = sc.next();
		System.out.println("Enter Receiver Account No ");
		User receiver = findAccount(users, sc);
		if (receiver == null) {
			System.err.println("Account not found");
			return;
		}
		System.out.println("Enter Amount to send");
		int amount = sc.nextInt();

		sender.transferBalance(receiver, amount, pin);
		new Transaction("->Transfered", amount);
	}

	static void withdraw(Scanner sc, User[] users) {
		User target = findAccount(users, sc);
		System.out.println("Enter Pin");
		String pin = sc.next();
		System.out.println("Enter Amount To Withdraw");
		int amount = sc.nextInt();
		if (target == null) {
			System.err.println("Account not found");
			return;
		}
		target.withdraw(amount, pin);
		new Transaction("->Withdrawed", amount);
	}

	static void deposit(Scanner sc, User[] users) {
		User target = findAccount(users, sc);
		System.out.println("Enter Pin");
		String pin = sc.next();
		System.out.println("Enter Amount To Deposit");
		int amount = sc.nextInt();
		if (target == null) {
			System.err.println("Account not found");
			return;
		}
		target.deposit(amount, pin);
		new Transaction("->Deposit", amount);
	}

	static User findAccount(User users[], Scanner sc) {
		System.out.println("Enter Account No");
		String accountNo = sc.next();
		User target = null;
		for (User x : users) {
			if (x.getAccNo().equals(accountNo)) {
				System.out.println("Account Found");
				x.displayAccInfo();
				target = x;
			}
		}
		return target;
	}

	static void displayAccounts(User users[]) {
		for (User x : users) {
			x.displayAccInfo();
		}
	}

	static void highestBalanceUser(User[] users) { // To check the highest balance user in total users

		User highestBalance = users[0];

		for (User x : users) {
			if (x.getBalance() > highestBalance.getBalance()) {
				highestBalance = x;
			}
		}
		System.out.println("Highest balance User is : " + highestBalance.getUsername());
		System.out.println("The Balance is : " + highestBalance.getBalance());
	}
}
