package com.Inheritance.EmployeeManagement;
/**
 * Developer class should get an 15% bonus on the base salary
 */
public class Developer extends Employee{
	String programmingLanguage;
	public Developer(String id, String name, double baseSalary, String programmingLanguage , int bonusPercent) {
		super(id, name, baseSalary,bonusPercent);
		this.programmingLanguage = programmingLanguage;
	}
	public void showDetails() {
		System.out.println("Job Role     : Developer");
		System.out.println("Pro. Language: " + programmingLanguage);
		super.showDetails();
	}
	
}
