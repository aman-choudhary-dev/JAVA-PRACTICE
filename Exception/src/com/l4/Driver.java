package com.l4;

public class Driver {
	public static void main(String[] args) {
		PaymentMgmt mgmt = new PaymentMgmt();
		try {
		mgmt.doPayment("3654684", 1500);
		}
		catch(FundTransferException e) {
			System.out.println("Error While Transfering");
			e.printStackTrace();
		}
		System.out.println("Program End");
	}
}
