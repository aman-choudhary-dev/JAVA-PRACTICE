package com;

public class Drvier2 {
	public static void main(String[] args) {
		Users u1 = new Users();
		Users u2 = new Users("Aman" , "kw123" , "free");
		Users u3 = new Users("Aadaw" , "kw123" , "free");
		Users u4 = new Users("Amd" , "kw123" , "paid");
		Users u5 = new Users();
		System.out.println("Total no of users currently watching : " + Users.liveCount);
		
	}
}
