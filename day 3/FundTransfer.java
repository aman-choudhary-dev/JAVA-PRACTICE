class FundTransfer{
	public static void main(String args[]){
		FundTransfer fundTransfer = new FundTransfer();	// We need to create this object here because transfer method is non static
		// Static method can't call non static method directly without creating an object
		fundTransfer.transfer("123456" , "654321" , 500.0);
	}
	public void transfer(String sender , String reciever , double amount){
		if(amount > 0){
			System.out.println("Transfered Amount " + amount + " from " + sender + " to "  +reciever);
		}else{
			System.out.println("Invalid Transfer Amount");
		}
	}
}