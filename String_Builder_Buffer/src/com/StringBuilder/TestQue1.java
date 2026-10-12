package com.StringBuilder;

public class TestQue1 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = s1.intern();
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		
		String s4 = "Hello";
		String s5 = " World";
		String s6 = s4 + s5;  // this will be on heap only
		s6.intern();  // this will take the obj and start pointing to the refernce in pool
		String s7 = "Hello World"; // since the string is already in the pool now it will refer to the same thing
		System.out.println(s7 == s6);
	}
}
