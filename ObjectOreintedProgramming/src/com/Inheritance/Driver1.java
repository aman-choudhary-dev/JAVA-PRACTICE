package com.Inheritance;

class Employee {
	String name = "Aman";
	String address = "Bangalore";
	String empId = "adwa568";
	public void markIn(String empId) {
		System.out.println("Marking In : " + empId);
	}
}
class Manager extends Employee{
	public void doSomething() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(empId);
	}
}
public class Driver1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.doSomething();
	}
}
