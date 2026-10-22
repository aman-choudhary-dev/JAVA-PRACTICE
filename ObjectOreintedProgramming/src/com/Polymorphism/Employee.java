package com.Polymorphism;

public class Employee {
	void markIn() {
		System.out.println("Employee Marking in");
	}
}

class HRManager extends Employee{
	void markIn() {
		System.out.println("HR manage marking in");
	}
	void doSomethig() {
		System.out.println("Doing Something");
	}
}
