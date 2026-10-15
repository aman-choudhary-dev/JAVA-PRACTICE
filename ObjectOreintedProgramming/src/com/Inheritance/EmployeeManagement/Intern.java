package com.Inheritance.EmployeeManagement;
/**
 * Intern Class no base salary only stipend and no bonus for the intern
 */
public class Intern extends Employee{
	double stipendMonth;

	public Intern(String id, String name, double baseSalary, int bonusPercent , double stipendMonth) {
		super(id, name, baseSalary ,bonusPercent);
		this.stipendMonth = stipendMonth;
	}
	public void showDetails() {
		System.out.println("Job Role     : Intern");
		System.out.println("Stipend      :" + stipendMonth);
		super.showDetails();
	}
	
}
