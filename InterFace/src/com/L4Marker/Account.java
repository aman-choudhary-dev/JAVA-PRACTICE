package com.L4Marker;
/**
 * Implementing cloneable give permision so that this class object can be clone by other object
 * 
 * Cloneable is marker interface which check instanceOf to give permission to perform activity
 * 
 * such as cloning 
 * 
 * Same For Serializing it is also a marker interface which give ability to serialize the obj 
 * 
 * what it is we will understand later
 */
public class Account implements Cloneable {
	String name;
	String no;
	public Account(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
