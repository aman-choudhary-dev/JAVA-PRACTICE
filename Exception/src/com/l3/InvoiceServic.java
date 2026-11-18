package com.l3;

public class InvoiceServic {
	public void generateInvoice() {
		try {
			connectingToDb();
			String name = null;
			name.lastIndexOf('a');
			System.out.println("Generating an Invoice....");
		}catch(Exception e){
			System.out.println("Some Exception Came");
			e.printStackTrace();
		}
		/**
		 * Finally block is used for doing operation which is imp to do 
		 * cause some time after exception ur line will not be execute at that time finally block 
		 * help us solve that issue by mandatory execution of those lines
		 * 
		 * Only chance when the finally block do not get executed are when JVM crashes
		 * due to system failure or memory full error
		 */
		finally { // Mandatory block which will execute even if exception occur or not
			clossingDB();
		}
	}
	public void connectingToDb() {
		System.out.println("Connecting with DATABASE");
	}
	public void clossingDB() {
		System.out.println("CLossing connection with database");
		
	}
}
