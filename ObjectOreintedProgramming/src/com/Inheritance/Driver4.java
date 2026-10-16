package com.Inheritance;
/**
 * Hierarchical Inheritance
 */
class Employee1{
	void showDetail() {
		System.out.println("Employee");
	}
}
class Manager1 extends Employee1{
	@Override
	void showDetail() {
		System.out.println("Manager also a Employee");
	}
}
class Developer extends Employee1{
	@Override
	void showDetail() {
		System.out.println("Developer also a Employee");
	}
}
public class Driver4 {
 public static void main(String[] args) {
	Developer d = new Developer();
	d.showDetail();
}
}
