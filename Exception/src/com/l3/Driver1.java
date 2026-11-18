package com.l3;
/**
 * 	(- Every Exception occur during runtime of program -)
 * Type of Exception : - 
 *  1 -> Checked Exception : Exception which is found during writing of code and compile caught it 
 *  							like classNotFound , FileNotFound , IOException
 *  				They are more critical to the program so Compile tell you to handle them specifically
 *  
 *  2 -> Unchecked Exception : Exception which occur during runtime all those exception like arrayIndexOutofbounds
 *  						NullPointerException and all which found duting running of the application
 */

public class Driver1 {
	public static void main(String[] args) {
		String name = null;
		System.out.println(name.charAt(0)); // NullPointerException
		
		String className = "com.l3.Driver1";
		try{
			// Checked Exception cause if this is not found whole program might not even start
			Class.forName(className); // This will throw classNotFound Exception
			// Class is used to load the class in Memory
			System.out.println("Class Loaded");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
