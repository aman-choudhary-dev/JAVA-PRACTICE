package com.tcs;

public class Address implements Cloneable {
	String line1;
	String line2;
	public Address(String line1, String line2) {
		super();
		this.line1 = line1;
		this.line2 = line2;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
