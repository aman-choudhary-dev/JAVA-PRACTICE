package com;
/**
 * This user class is for creating a user for instamart;
 */
public class User {
	String name;
	String eMail;
	String phNo;
	public User(String phNo) {
		// TODO Auto-generated constructor stub
		this("guest" , "guest@gmail.com");
		this.phNo = phNo;
	}
	public User(String name , String eMail) {
		this.name = name;
		this.eMail = eMail;
		System.out.println("User has been created");
	}
}
