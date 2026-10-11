class FundTransfer{
	public static void main(String a[])
	{
		System.out.println("Entered Main");
		System.out.println((funTransfering(500 , "7854254961361" , "68465135156") ? "Transfered Succesfully" : "Failed Transfered"));
		System.out.println("Exited Main");
		
	}
	//SOLID 
	//We use String for acc no becuase we don't do any action in the no that why we use string to just compare
	static boolean funTransfering(int amount , String senerAcc , String receiverAcc)
	{
		System.out.println("Entered transfering method");
		System.out.println("Input : " + amount + " " + senerAcc + " " + receiverAcc);
		boolean result = (amount > 0);
		System.out.println("Exited Method");
		return result;
	}
}