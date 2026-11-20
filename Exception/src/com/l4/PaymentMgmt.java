package com.l4;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
/**
 * throw and throws
 * 
 *  when we use throw word we create a new object of exception it throwing and the method which called this method need to implement
 *  
 *  throws in its method and mention what exception  its throwing
 *  
 *  If the method mention that it might throws 2 exception then the class or method calling it should be able to handle these 
 *  2 exception otherwise it will throw compile error 
 */
public class PaymentMgmt {
	public void doPayment(String accNO , int amount) throws FundTransferException
	{
		try{
			checkBalance(accNO, amount);
		}catch(InsufficientBalanceException | FileNotFoundException e) // Ways to handle two exception in one go but they need to be diff
					// Can't be in a parent child relation then only we can use this
		{
			throw new FundTransferException("this acc does not follow the standard of transfering fund");
		}
	}
	public boolean checkBalance(String accNo , int amount) throws InsufficientBalanceException , FileNotFoundException
	{
		boolean checkBalance = false;
		int balance = 1000; // fetching from database
		if(balance < amount) {
			throw new InsufficientBalanceException("Your acc doesn't have sufficient balance"+ balance);
		}else {
			checkBalance = true;
		}
		return checkBalance;
	}
}
