package com.Inheritance;

public class Product {
	String productName;
	String description;
	int quantity;
	String status;
	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;
	}
	public void viewDetails() 
	{
		System.out.println("ProductName : " +productName);
		System.out.println("Des : " + description);
		System.out.println("Quantity : " +quantity);
		System.out.println("Availability : " +status);
	}
}
