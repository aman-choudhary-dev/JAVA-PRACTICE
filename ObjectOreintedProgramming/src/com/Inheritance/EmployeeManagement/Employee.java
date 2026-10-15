package com.Inheritance.EmployeeManagement;

public class Employee {
	private String id;
	private String name;
	protected double baseSalary;
	int bonusPercent ;
	public Employee(String id, String name, double baseSalary , int bonusPercent) {
		super();
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.bonusPercent = bonusPercent;
	}
	public double calculateBonus(int bonusPercent) {
		double bonus = 0;
		if(bonusPercent > 0) {
			bonus = (baseSalary * bonusPercent)/100;
		}
		
		return bonus;
	}
	public double totalSalary() {
		baseSalary += calculateBonus(bonusPercent);
		return baseSalary;
	}
	public void showDetails() {
		System.out.println("Name         : " + name);
		System.out.println("Id           : " + id);
		System.out.println("Base Salary  : " + baseSalary);
		System.out.println("Total Salary : " + totalSalary());
		System.out.println("===============================");
	}	
	
}
