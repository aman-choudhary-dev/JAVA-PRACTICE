package com;

public class MakeMyTrip {

	public double discount(int total) {
		double finalPrice = total;
		if (total > 0 && total < 5000) {
			System.out.println("No Discount");
		} else if (total >= 5000 && total <= 10000) {
			System.out.println("Discount : " + (total * .1));
			finalPrice = total - (total * .1);
		} else if (total > 10000) {
			double discount = total * .15;
			if (discount > 1250) {
				System.out.println("Discount : " + 1250);
				finalPrice = total - 1250;
			} else {
				System.out.println("Discount : " + discount);
				finalPrice = total - discount;
			}
		}
		return finalPrice;
	}
}
