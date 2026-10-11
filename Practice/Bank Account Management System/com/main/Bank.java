package com.Main;
import com.Accounts.Users;

class Bank{
	public static void main(String a[]){
		System.out.println("Bank System Started");
		Users u1 = new Users("85269638" , "Aman Choudhary" , "1789" , 80000);
		Users u2 = new Users("85846841" , "Rahul Tiwari" , "1456" , 10000);
		Users u3 = new Users("85561351" , "Eklavya Bhism" , "1234" , 20000);
		
		u1.deposit(20000 , "1789");
		
		u1.withdraw(50000 , "1789");
		u1.displayAccInfo();
	}
}