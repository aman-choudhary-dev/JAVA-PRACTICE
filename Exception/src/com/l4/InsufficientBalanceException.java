package com.l4;
/**
 * User Defined Exception
 * 
 * 	created by extending runtime Exception and making a constructor so that we can create a object of class 
 */
public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
