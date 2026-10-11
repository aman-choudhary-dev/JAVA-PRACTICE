package com;
class ThisTest{
	int id;
	String name ;
	String batch;
	ThisTest(int id , String name , String batch) {
		// TODO Auto-generated constructor stub
		this(id , name);
		this.batch = batch;
	}
	ThisTest(int id , String name){
		this.id = id;
		this.name = name;
	}
	void displayInfo() {
		System.out.println("ID :" + id);
		System.out.println("Name :" + name);
		System.out.println("Batch : " + batch);
	}
}

public class Driver1 {
	public static void main(String[] args) {
		ThisTest t = new ThisTest(89, "Aman" , "aug25");
		t.displayInfo();
		ThisTest t1 = new ThisTest(89 , "Akash");
		t1.batch = "Oct ";
		t1.displayInfo();
	}
}
