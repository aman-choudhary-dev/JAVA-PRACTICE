package com;
/**
 * This is class is being used to learn Static initialization block
 */
public class User {
	String userName;
	String userId;
	String mbNo;
	// Static block only execute once doesn't matter if there thousands of object creation happens
	// New Keyword is imp for for the class to be called just declaring class won't do anything
	static { // This block will always execute first when the class is called for the first time
		System.out.println("This is static Initialization block");
	}
	public User(String userName, String userId, String mbNo) {
		super();
		System.out.println("Object created");
		this.userName = userName;
		this.userId = userId;
		this.mbNo = mbNo;
	}
	
	
}
