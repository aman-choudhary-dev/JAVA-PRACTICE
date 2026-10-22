package com.Polymorphism.Vechicle_Rental_System;

public class PetrolBike extends Vehicle{

	public PetrolBike(String vehicleNumber, double pricePerHour) {
		super(vehicleNumber, pricePerHour);
	}
	@Override
	public double calculateRentalCost(int hours) {
		return (getPricePerHour()*hours)+ 50;// fixed 50Rs fuel price per rental
	}
}
