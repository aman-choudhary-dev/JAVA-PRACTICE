package com.Inheritance;

public class ElectronicProduct extends Product {
	boolean isWarrany;
	int warrantyInYears;
	public ElectronicProduct(String productName, String description, int quantity, String status ,boolean isWarrany, int warrantyInYears) {
		super(productName, description , quantity , status);
		this.isWarrany = isWarrany;
		this.warrantyInYears = warrantyInYears;
	}
	public void viewElectronicDetails() {
		viewDetails();
		System.out.println("Warranty Available : "+isWarrany);
		System.out.println("Warranty Perioud : "+warrantyInYears);
	}
	
}
