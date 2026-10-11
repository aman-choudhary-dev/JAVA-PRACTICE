package com;

import java.util.Scanner;

public class Driver1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int price = 0;
		System.out.println("Enter price");
		if(sc.hasNextInt()) {
			price =sc.nextInt();
		}else {
			System.out.println("ENter right price format");
		}
		System.out.println("Price : " + price);
		sc.close();
		int max = 10;
		int start = 0;
		//w While loop won't even run if the condition is false and if it run then it wont stop until the condition become false
		while(start < max) {
			System.out.println("Executing : " + start);
			start = start +1;
		}
		
		int i = 0;
		// do while run atleast one time before checking the condition
		do {
			System.out.println("Execute atleast one time");
		} while(i > 10);
	}
}
