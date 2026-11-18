package com.tcs;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("BTM", "Bangalore");
		Employee employee = new Employee("AMan", "ADA", address);
		/**
		 * Its a Shallow cloning it only copy the variable of the direct class it getting clone
		 * and only copy the reference of the other class object in the same object
		 * like address obj on the employee obj
		 */
		Employee clone  = (Employee) employee.clone();
		System.out.println(clone.name);
		System.out.println(clone.address.line1);
	}
}
