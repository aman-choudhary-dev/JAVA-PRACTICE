package com.users;

public class Transaction {
		String task;
		int amount ;
		static int history = 0;
		static Transaction[] historys = new Transaction[5];
		public Transaction(String task , int amount) {
			// TODO Auto-generated constructor stub
			this.task = task;
			this.amount = amount;
			historys[history] = this;
			history++;
		}
		public void displayHistory() {
			System.out.println(task + " " + amount );
		}
		public static void displayAllHistory() {
		    for (int i = 0; i < history; i++) {
		        historys[i].displayHistory();
		    }
		}
}
