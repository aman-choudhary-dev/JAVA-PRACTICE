package com.L5Marker;
/**
 * Until we implement the cleanable class it will never be the instance of cleanable so it will always give false 
 * and it will failed to authorized the task clean on the driver class
 */
public class User implements Cleanable{
	String name;
	String address;
	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
}
