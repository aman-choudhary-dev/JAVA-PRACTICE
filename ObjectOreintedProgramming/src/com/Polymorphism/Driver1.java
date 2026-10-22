package com.Polymorphism;

public class Driver1 {
	public static void main(String[] args) {
		Employee e = new HRManager();
		e.markIn();
//		e.doSomething();
		HRManager h = new HRManager();
		h.doSomethig();// not the right way though it will work
	}
}
