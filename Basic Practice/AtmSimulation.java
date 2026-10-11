import java.util.*;
class AtmSimulator{
	static int  balance = 10000;
	public static void main(String a[]){
		Scanner sc = new Scanner(System.in);
		int btn = 0;
		while(btn != 4){
			System.out.println("=====================");
			System.out.println("    ATM SIMULATOR    ");
			System.out.println("=====================");
			System.out.println("1. Check Balance \n2. Deposit Money \n3. Withdraw Money \n4. Exit");
			System.out.println("=====================");
			System.out.println("Enter your choice");
			btn = sc.nextInt();
			if(btn == 1){
				AtmSimulator.checkBalance();
			}
			else if(btn == 2){
				AtmSimulator.depositMoney();
			}
			else if(btn == 3){
				AtmSimulator.withdrawMoney();
			}
		}
		System.out.println("Exiting The Simulator");
		System.out.println("      Thank You      ");
	}
	static void checkBalance(){
		System.out.println("Current Balance is : " + AtmSimulator.balance);
		//AtmSimulator.main(new String[]{}); // new string to pass and curly brace tell that its empty
	}
	static void depositMoney(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount ");
		int amount = sc.nextInt();
		if(amount <= 0 ){
			System.out.println("=====================");
			System.out.println("Enter Valid Amount");
		}else{
			AtmSimulator.balance += amount;
			System.out.println("Amount Succesfully Deposited");
			System.out.println("Current Balance is : " + AtmSimulator.balance);
		}
//		AtmSimulator.main(new String[]{});
		
	}
	static void withdrawMoney(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to Withdraw ");
		int amount = sc.nextInt();
		if(amount <= 0){
			System.out.println("=====================");
			System.out.println("Enter Valid Amount");
		}else if(amount > AtmSimulator.balance){
			System.out.println("Insufficient Balance ");
		}else{
			AtmSimulator.balance -= amount;
			System.out.println("Amount Succesfully Withdrawed");
			System.out.println("Current Balance is : " + AtmSimulator.balance);
		}
		//AtmSimulator.main(new String[]{});
	}
}