package com.l3;

public class Driver {
	public static void main(String[] args) {
//		InvoiceServic invoiceServic = new InvoiceServic();
//		invoiceServic.generateInvoice();
		Driver driver = new Driver();
		int finalAm =driver.calcDiscount(100, 10);
		System.out.println(finalAm);
	}
	
	private int calcDiscount(int amount , int disc) {
		int finalAmt = 0;
		try {
			finalAmt = amount - (amount*disc)/100;
			return finalAmt; // it will be 90 if it return from here
		}catch(Exception e) {
			System.out.println("Some Exception");
			e.printStackTrace();
		}
		finally {
			finalAmt = 110;
//			return finalAmt; // if we return from here it will override the value of try block and print 110
			// we can return directly from finally block instead of returning at last
		//	it will be only overriding if we are returning from the finally block
		}
		return finalAmt;
	}
}
