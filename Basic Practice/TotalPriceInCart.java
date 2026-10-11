class TotalPriceInCart{
	public static void main(String a[]){
		String items[]= {"iPhone" , "iPad"};
		int prices[] = {100000 , 50000};
		// Since we have made method to calculate total price no static we will have to create an object for it to call
		TotalPriceInCart c1 = new TotalPriceInCart();
		System.out.println("total Price of your items is " + c1.totalPrice(prices));
	}
	int totalPrice(int prices[]){
		int sum = 0;
		for(int x : prices){
			sum += x;
		}
		return sum;
	}
}