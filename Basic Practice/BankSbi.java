class BankSbi{
	double balance ;  // Instance Variable each obj will have its own separate copy
	static double interest = 12.6;
	BankSbi(double balance){ // we will need to send balance as an parameter while creating obj
		this.balance = balance;
	}
	public static void main(String a[]){
		BankSbi acc1 = new BankSbi(10000);
		BankSbi acc2 = new BankSbi(60000);
		System.out.println( "Balance of ACC 1 " + acc1.balance);
		System.out.println("Balance of ACC 2 " + acc2.balance);
		System.out.println( "Interest Rate is " + BankSbi.interest);
		
	}
}