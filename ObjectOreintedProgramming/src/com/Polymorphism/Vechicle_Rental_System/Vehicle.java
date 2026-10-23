package com.Polymorphism.Vechicle_Rental_System;

public abstract class Vehicle {
	private String vehicleNumber;
	private double pricePerHour;
	private boolean isRented;

	public Vehicle(String vehicleNumber, double pricePerHour) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.pricePerHour = pricePerHour;
	}

	public abstract double calculateRentalCost(int hours);

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public double getPricePerHour() {
		return pricePerHour;
	}

	public boolean isRented() {
		return isRented;
	}

	public void rent() {
		if (isRented != true) {
			isRented = true;
		} else {
			System.err.println("This Vehicle is already rented");
		}
	}

	public double returnVehicle(int hours) {
		if (isRented == true) {
			if(hours > 0) {
				isRented = false;
				return calculateRentalCost(hours);				
			}else {
				System.err.println("Enter Valid Rent Time");
			}
		} else {
			System.err.println("This vehicle was never rented");
		}
		return pricePerHour*hours;
	}

}
