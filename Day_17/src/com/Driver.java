package com;

public class Driver {
	public static void main(String[] args) {
		MakeMyTrip m = new MakeMyTrip();
		double finalPrice = m.discount(20000);
		System.out.println("Final Price Need To Pay : " +finalPrice);
	}
}
