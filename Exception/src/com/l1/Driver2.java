package com.l1;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("Driver main started");
		try {
			int no = Integer.parseInt(args[0]);
			int amount = 100;
			try {
				int ans = amount/no;
				System.out.println(ans);
			}catch(ArithmeticException e) {
				System.out.println("Infinity , change no");
			}
		}catch(NumberFormatException e) {
			System.out.println("Write valid no in the number format");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("pass the args");
		}
		
	}
}
