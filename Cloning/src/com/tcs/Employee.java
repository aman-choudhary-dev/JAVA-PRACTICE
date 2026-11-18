package com.tcs;

public class Employee implements Cloneable{
	String name; // copy
	String id; // copy
	Address address; // only the reference is copied so clone and main object will refer the same thing 
	public Employee(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
