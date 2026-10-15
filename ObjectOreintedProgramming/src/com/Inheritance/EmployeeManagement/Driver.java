package com.Inheritance.EmployeeManagement;

public class Driver {
	public static void main(String[] args) {
		Intern intern = new Intern("RH158", "Rohit",0 , 0 , 12000);
		intern.showDetails();
		Manager manager = new Manager("AN152", "Ankit", 50000, 10, 15);
		manager.showDetails();
		Developer developer = new Developer("AM782", "Aman", 70000, "JAVA", 15);
		developer.showDetails();
	}
}
