package com.Polymorphism.Order;

public class Client {
	public static void main(String[] args) {
		OrderProcessor orderProcessor = new OrderProcessor(); 
		
		Order order = new OnlineOrder("9593" , "Iphone" , 100000);
		orderProcessor.process(order);
		
	}
}
