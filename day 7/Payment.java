class Payment{
	static int amount = 500; // Universal variable can be leave empty it will store default value which is 0;
	public static void main(String a[]){
		//int amount = Integer.parseInt(a[0]);  // Local Variable have to be initialized we can't don anything without it
		int toWithdraw = Integer.parseInt(a[0]);
		System.out.println("Current Balance is : " + amount);
		System.out.println("Amount withdrawed : " + toWithdraw);
		int current = amount -toWithdraw;
		Payment.localVariableTest();
		System.out.println("Current Balance : "  + current);
	}
	// Local variable are stored in stack with method 
	static void localVariableTest(){
		System.out.println("Initial  Balance was : " +amount);
	}
}