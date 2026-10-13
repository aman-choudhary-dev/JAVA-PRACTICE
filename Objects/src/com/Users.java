package com;
/**
 * Users class for hotstar
 */
public class Users {
	String userName;
	String userId;
	String type;
	static int liveCount = 0; // static variable to share with every object
	public Users(String userName, String userId, String type) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.type = type;
	}
	public Users(String userName, String type) {
		super();
		this.userName = userName;
		this.type = type;
	}
	public Users() {
		// TODO Auto-generated constructor stub
	}
	// Reason for using IIB instead of writing it on the constructor is code reusability
	{
		liveCount++;
	}
}
