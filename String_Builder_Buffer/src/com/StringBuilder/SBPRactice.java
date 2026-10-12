package com.StringBuilder;

public class SBPRactice {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.append(false); // it can append false on the string
		sb.append("a");
		System.out.println(sb);
		int s =sb.capacity(); // it has some formula to create check sir notes
		System.out.println(s);
	}
}
