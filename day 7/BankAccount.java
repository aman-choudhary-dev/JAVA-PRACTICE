class BankAccount{
	String username; // Instance Variable
	String pin;
	int balance;
	static int interest = 9;  // Local Variable will be common for every methods in class
	// will be created for every single object of this class
	public static void main(String a[]){
		BankAccount u1 = new BankAccount(); // new obj creation
		u1.username = "Aman"; // assigning value to instance variable
		u1.pin = "1234";
		u1.balance = 5000;
		System.out.println(u1);
		System.out.println( "Interest Rate on every user : " +interest);
	}
}