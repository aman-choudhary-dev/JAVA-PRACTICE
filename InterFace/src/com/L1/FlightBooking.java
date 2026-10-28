package com.L1;
/**
 * This class is implementing the IDiscount so it will over ride the calculateDiscount method 
 * otherwise it will throw compilation error
 */
public class FlightBooking implements IDiscount{
	
	@Override
	public void calculateDiscount(int amount , int discountRate) {
		int finalFare = amount - (amount*discountRate)/100;
		System.out.println(finalFare);
	}
}
