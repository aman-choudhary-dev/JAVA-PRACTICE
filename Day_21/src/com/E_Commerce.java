package com;

public class E_Commerce {
	public static void main(String[] args) {
		Customer c= new Customer("Gold", 1200);
		Customer c2 = new Customer("Silver", 5000);
		c.totalPrice();
		c2.totalPrice();
	}
	
}
