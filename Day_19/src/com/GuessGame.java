package com;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int luckNo = 55;
		int userEntered = 0;
		while(userEntered != luckNo) {
			System.out.println("Please Enter No");
			userEntered = sc.nextInt();
			if(userEntered == luckNo) {
				System.out.println("You Won !!!");
			}else {
				System.err.println("Wrong no Try again");
			}
		}
		sc.close();
	}
}
