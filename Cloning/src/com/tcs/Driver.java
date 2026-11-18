package com.tcs;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("BTM", "Bangalore");
		Employee employee = new Employee("Aman", "ADA", address);
		/**
		 * Its a Shallow cloning it only copy the variable of the direct class it getting clone
		 * and only copy the reference of the other class object in the same object
		 * like address obj on the employee obj
		 * 
		 * So the cloned object and main obj will pointing to the same object reference means changing will 
		 * be impacting on the both 
		 * 
		 * 
		 * To Acheive Deep Cloning We need the other class to also implement cloneable and method clone as well
		 * 
		 * checkout address and employee class for more
		 */
		Employee clone  = (Employee) employee.clone();
		employee.address.line1 = "Hyd";
		System.out.println(clone.name);
		System.out.println(clone.address.line1);
		System.out.println(employee.address.line1);
	}
}
