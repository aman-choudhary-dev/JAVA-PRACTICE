package com;

public class Customer {
	String type;
	int price;

	public Customer(String type, int price) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.price = price;
	}

	void totalPrice() {
		int totalPrice = price;
		int discount;
		if (price > 1000) {
			switch (type) {
			case "Gold":
				discount = Customer.maxDiscount(20, price);
				if (discount > 2500) {
					totalPrice -= 2500;
				} else {
					totalPrice -= discount;
				}

				break;

			case "Silver":
				discount = Customer.maxDiscount(10, price);
				if (discount > 2500) {
					totalPrice -= 2500;
				} else {
					totalPrice -= discount;
				}
				break;

			case "Regular":
				discount = Customer.maxDiscount(5, price);
				if (discount > 2500) {
					totalPrice -= 2500;
				} else {
					totalPrice -= discount;
				}
				break;

			}

		}
		System.out.println("Total Price is : " + totalPrice);;
	}

	static int maxDiscount(int discount, int price) {
		int dis = (price * discount) / 100;
		return dis;
	}
}
