package com.L3;

public class Driver {
	public static void main(String[] args) {
		IAccount acc = () -> {
			System.out.println("Opening account");
		};
		
		acc.openAccount();
		
		IAccountMgmt acc1 = (name , no) -> {
			System.out.println("Acc Holder Name : " + name);
			return "Account Opened";
		};
		acc1.opeingAccount("Aman", "64684");
	}
	
}
