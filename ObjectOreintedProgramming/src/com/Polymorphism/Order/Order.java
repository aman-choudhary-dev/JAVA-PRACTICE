package com.Polymorphism.Order;

public class Order {
	String orderId;
	String name;
	int price;
	public Order(String orderId, String name, int price) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price = price;
	}
	public void processOrder() {
		System.out.println("Processing Order");
	}
	public void showDetail() {
		System.out.println("Name  :" + name);
		System.out.println("Id    :" + orderId);
		System.out.println("Price :" + price);
	}
}
