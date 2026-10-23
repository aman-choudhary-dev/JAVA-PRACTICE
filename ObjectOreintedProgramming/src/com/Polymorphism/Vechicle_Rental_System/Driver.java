package com.Polymorphism.Vechicle_Rental_System;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1 = new PetrolBike("MH 12 VY 4845", 100);
		Vehicle v2 = new SportsBike("CG 12 CY 1548", 250);
		Vehicle v3 = new ElectricScooter("HG 52 YY 8948", 80);
		v1.rent(); // will rent the Petrol Vehicle;
		v2.rent(); // will rent the Sports Bike;
		v3.rent(); // will rent the Electric Scooter;
		
		System.out.println("Total Cost : " +v1.returnVehicle(3));
		System.out.println("Total Cost : " +v2.returnVehicle(3));
		System.out.println("Total Cost : " +v3.returnVehicle(3));
		System.out.println(v1.calculateRentalCost(3));
	}
}
