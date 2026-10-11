package com;

public class Driver2 {
	public static void main(String[] args) {
		String s = "Aman";
		String s1 = s.concat(" Choudhary");
		String s2 = "Aman";
		String s3 = new String ("Aman");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s== s2); // pointing to same reference
		System.out.println(s== s3); // false
		System.out.println(s.equals(s3));
	}
}


// == -> REFRENCES COMPARE