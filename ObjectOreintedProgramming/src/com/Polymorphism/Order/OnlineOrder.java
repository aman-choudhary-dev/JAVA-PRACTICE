package com.Polymorphism.Order;

public class OnlineOrder extends Order{

	public OnlineOrder(String orderId, String name, int price) {
		super(orderId, name, price);
	}
	@Override
	public void processOrder() {
		System.out.println("Processing Online Order");
		this.showDetail();
	}
}
