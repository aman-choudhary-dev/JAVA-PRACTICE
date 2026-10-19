package com.Abstraction;

/**
 * Abstracted class for placing order
 */
public class Order {
	String id;
	int price;

	public Order(String id, int price) {
		super();
		this.id = id;
		this.price = price;
	}

	public void placeOrder() { // only method which will be accessible outside of this class
		validateOrder(id);
		if (processingOrderPayment()) {
			generatingInvoice(id, price);
		} else {
			System.err.println("Payment Failed");
		}

	}

	// All private method and their implementation will be hidden in another class
	private void validateOrder(String id) {
		System.out.println("Validating Order for : " + id);
	}

	private boolean processingOrderPayment() {
		System.out.println("Payment Completed");
		return true;
	}

	private void generatingInvoice(String id, int price) {
		System.out.println("Invoice Generated");
		System.out.println("Order Id : " + id);
		System.out.println("Total Price : " + price);
	}
}
