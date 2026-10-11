class BankAccount{ // doesn't need to be public since we are in the same package
	private String username; // Instance Variable for every objects
	private String pin;
	private int balance;
	BankAccount(String username , String pin , int balance){
		this.username = username;
		this.pin = pin;
		this.balance = balance;
	}
	static int interest = 9;  // Local Variable will be common for every methods in class
	public void getBalance(){ // no need to give parameter as the object call will decide it
		System.out.println("Current balance is : " + balance);
	}
	
	public void deposit(int amount , String currPin){ // public setters to control user balance from outside
		if(currPin.equals(pin) && amount >= 0){
			balance += amount;
			System.out.println("Amount succesfully credited");
			System.out.println("Current amount : " + balance );
		}else{
			System.out.println("Enter Correct pin and valid amount");
		}
	}
	
	public void withdraw(String currPin , int amount){
			if(currPin.equals(pin) &&  amount <= balance){
				System.out.println("Amount succesfully withdrawed");
				balance -= amount;
				System.out.println("Current amount : " + balance );
			}else{
				System.out.println("Enter Correct pin and valid amount");
			}
	}
	public void printDetail(){
		System.out.println("User Name : " + username + "--> Current Balance : " + balance );
	}
}