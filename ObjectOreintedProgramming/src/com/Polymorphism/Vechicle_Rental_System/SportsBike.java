package com.Polymorphism.Vechicle_Rental_System;

public class SportsBike extends Vehicle {

	public SportsBike(String vehicleNumber, double pricePerHour) {
		super(vehicleNumber, pricePerHour);
	}

	@Override
	public double calculateRentalCost(int hours) {
		int premiumRent = 200;
		// Charges an addition 200 rs for premium vehicle
		return (getPricePerHour() * hours) + premiumRent;
	}
}
