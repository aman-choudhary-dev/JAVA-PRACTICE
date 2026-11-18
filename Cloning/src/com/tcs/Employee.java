package com.tcs;

public class Employee implements Cloneable{
	String name; // copy
	String id; // copy
	Address address; // only the reference is copied so clone and main object will refer the same thing 
	// Only after doing deep cloning it will copied the object 
	public Employee(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e = (Employee)super.clone();// THis line is copied to the e object
		// then we copy again in the address by implementing the cloneable in address
		e.address = (Address)address.clone();
		
		// instead of returning the super.clone here we will return e cause that is 
		// what full cloned object is
		return e;
	}
}
