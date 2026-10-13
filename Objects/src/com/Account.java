package com;
/**
 * This class is Used to learn Instance Initialization block
 */
// Parent class can also have the static and instance initialization block
public class Account {
	String acNo;
	public Account(String acNo) {
		super(); // first line always in constructor
		// --> Here It will auto call the instance init block
		System.out.println("Object created");
		this.acNo = acNo;
	}
	// Down Below is the Instance Init block
	// It will execute every time an object is created
	// this is always the second line in constructor
	{
		System.out.println("Instance Initializing Block is called");
	}
}
