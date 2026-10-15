package com.Inheritance.EmployeeManagement;

/**
 * Manager class which will have team size and based on that it will give bonus
 * per 1000 members and 10% on base salary
 */
public class Manager extends Employee {
	int teamSize;

	public Manager(String id, String name, double baseSalary, int bonusPercent, int teamSize) {
		super(id, name, baseSalary, bonusPercent);
		this.teamSize = teamSize;
	}

	public double calculateBonus(int bonusPercent) {
		double bonus = super.calculateBonus(bonusPercent);
		bonus += teamSize * 1000;
		return bonus;
	}

	public void showDetails() {
		System.out.println("Job Role     : Manager");
		System.out.println("Team Size    : " + teamSize);
		super.showDetails();
	}

}
