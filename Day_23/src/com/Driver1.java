package com;

public class Driver1 {
	public static void main(String[] args) {
		String s1 = "Kodewala";
		String s2 = new String("Academy");
		String s3 = new String ("Kodewala");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
}
