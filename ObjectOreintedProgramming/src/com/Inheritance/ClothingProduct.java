package com.Inheritance;

public class ClothingProduct extends Product {
	String color;
	int size;
	String fabric;
	public ClothingProduct(String productName, String description, int quantity, String status,String color, int size, String fabric) {
		super(productName, description , quantity ,status);
		this.color = color;
		this.size = size;
		this.fabric = fabric;
	}
	public void viewClothDetails() {
		viewDetails();
		System.out.println("Color : "+color);
		System.out.println("Size : "+size);
		System.out.println("Fabric Type : "+fabric);
	}
	
}
