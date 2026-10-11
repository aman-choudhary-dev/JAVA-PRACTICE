package day_13;

public class Account {
	String name;
	int balance;

	Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
		System.out.println("UserName : " + name);
		System.out.println("Balance  : " + balance);
	}
}
