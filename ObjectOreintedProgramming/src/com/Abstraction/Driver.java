package com.Abstraction;

public class Driver {
	public static void main(String[] args) {
		Order order = new Order("AD845" , 5000);
		order.placeOrder(); // only public method is visible to this object in this class
		//order.validateOrder(String id); can't access directly they are private
	}
}
