package com.l1;

public class Driver1 {
	public static void main(String[] args) {
		Driver1 d = new Driver1();
		d.doSomething();
	}
	public void doSomething() {
		String address = null;
		try {
			/**
			 * Risky code are written inside the try block
			 * if not application will terminate at that line
			 * 
			 * it create an exception object or its children obj and send it to the catch block
			 */
			System.out.println(address.length()); // was going to throw nullpointer exception
			System.out.println("Will not be printed since above line  throw exception it will go to catch block ");
		}catch(NullPointerException e) {
			System.out.println("address is null ...");
			e.printStackTrace(); // will print the exception it throw for devs
		}
	}
}
