package com.l1;
/**
 * Abnormal Situation which occur during program running is called exception
 * 
 * If it not handle it will terminate the program right there and the code after that will not executed
 */
public class Driver {
	public static void main(String[] args) {
		System.out.println("Driver Main Start");
		
		String name = args[0]; // If we don't pass any args it will throw (- ArrayIndexOutOfBoundsException -)
		int marks = Integer.parseInt(args[1]); // if we pass other type instead of int here it will throw 
		// NumberFormatException
		System.out.println(name);
		System.out.println(marks);
		
		int amount = 100;
		int n = 0;
		int ans = amount/n;
		// ArithmeticException if we try to divide any no with 0 
		System.out.println(ans);
		
		String address = null;
		System.out.println(address.length());// Trying to access null will throw NullPointerException
		System.out.println("Driver End");
	}
}
