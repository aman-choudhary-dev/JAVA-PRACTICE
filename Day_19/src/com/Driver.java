package com;

import java.util.Scanner;
/**
 * Class for learning Scanner class
 */
public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		sc.nextLine(); // After taking integer input it leaves next line character (\n) so we have to consume it using this empty input
		System.out.println("Enter your Address");
		String add = sc.nextLine();

		System.out.println("Name : " + name);
		System.out.println("age  : " + age);
		System.out.println("add  : " + add);
		sc.close();
	}
}
