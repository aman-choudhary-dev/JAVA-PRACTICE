package com.Polymorphism.Order;

public class CashOnDeleivery extends Order{

	public CashOnDeleivery(String orderId, String name, int price) {
		super(orderId, name, price);
	}
	@Override
	public void processOrder() {
		System.out.println("Processing Cash On Delievry Order");
		this.showDetail();
	}
}
