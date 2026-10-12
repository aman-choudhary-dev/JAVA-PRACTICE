package com.StringBuilder;

public class SBCompare {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello World");
		String s = new String ("Hello World");
		//System.out.println(sb == s); // it throwing an error cause we're trying to compare 2 diff class
		// both of them are on heap as diff obj
		System.out.println(s.equals(sb.toString())); // it return true because toString convert it into string class
		int arr[] = {5,6,2};
		String s1 = arr.toString();
		System.out.println(s1);
	}
}
