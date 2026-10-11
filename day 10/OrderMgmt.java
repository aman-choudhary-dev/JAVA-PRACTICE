class OrderMgmt{
	private int cartValue = 5000; // This one can only be used by this class only due to its private modifier
	public void placedOrder(String itemName){ // it can be used by another class  cause its public
		OrderMgmt obj1 = new OrderMgmt();
		System.out.println("Your item is succesfully placed : " + itemName);
		System.out.println("cart value : " + obj1.cartValue); // we can either used it directly or using object
	}
}