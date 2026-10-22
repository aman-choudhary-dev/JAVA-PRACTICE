package com.Polymorphism.Vechicle_Rental_System;

public class ElectricScooter extends Vehicle{

	public ElectricScooter(String vehicleNumber, double pricePerHour) {
		super(vehicleNumber, pricePerHour);
	}
	@Override
	public double calculateRentalCost(int hours) {
		double baseRental = getPricePerHour()*hours;
		// Applies a 10% discount to the base rental cost for EV 
		double discountedPrice = baseRental * .1;
		return baseRental- discountedPrice;
	} 
}
