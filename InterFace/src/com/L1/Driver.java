package com.L1;

public class Driver {

	public static void main(String[] args) {
		IDiscount i  = new FlightBooking();
		i.calculateDiscount(5000, 10);

	}

}
