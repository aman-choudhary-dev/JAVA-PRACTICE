package com;
class Teacher{
	int id;
	String name;
	public Teacher(int id , String name) {
		this.id = id;
		this.name = name;
	}
	void displayInfo() {
		System.out.println("ID : " + id);
		System.out.println("Name : "+ name);
	}
}
class Student extends Teacher{
	String batch;
	public Student(int id , String name ,String batch) {
		super(id , name);
		this.batch = batch;
		
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Batch : "  + batch);
	}
}
public class Test {
	public static void main(String[] args) {
		Student s = new Student(52 , "aman" , "aug25");
		s.displayInfo();
		Teacher t = new Teacher(89, "Suresh Sir");
		t.displayInfo();
	}
	
}
