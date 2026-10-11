package com;

public class User {
	String userName;
	String mobile;
	User(String userName , String mobile){
		this();
		this.userName = userName;
		this.mobile = mobile;
	}
	User(){
		System.out.println("User() .. no arg");
	}
}
