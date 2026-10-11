package com;

public class Driver {
	public static void main(String[] args) {
		User u1 = new User("8455682216"); // This will give a default name and email to this users
		System.out.println(u1.name);
		System.out.println(u1.eMail);
		System.out.println(u1.phNo);
		ClothesProduct c1 = new ClothesProduct("Jeans", 1500, "UC158", 36, "Blue");
		System.out.println(c1.price);
		
		// Updating User default details
		u1.name = "Aman";
		System.out.println(u1.name);
		u1 = new User("Akash" , "aman@gmail.com");
		System.out.println(u1.name);
		System.out.println(u1.eMail);
		System.out.println(u1.phNo);
	}
}
