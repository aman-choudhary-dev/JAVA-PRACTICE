package com.l2;

/**
 * Whenever Exception happen it create a object of that exception and send back
 * to the caller
 * 
 * from line 23 - > 17 - > 10 - > JVM
 */
public class Driver {
	public static void main(String[] args) {
		Account account = new Account();
		account.doActivateAcc("SBI_5468484");
		account.doActivateAcc(null); // will throw NullPointerException
	}
}

class Account {
	void doActivateAcc(String accNo) {
		System.out.println("Account.doActivateAcc() START");
		doValidate(accNo);
		System.out.println("Account.doActivateAcc() END");
	}

	private void doValidate(String accNo) {
		System.out.println("Account.doValidate() START");
		// Always put exception object catch block on the last or it will throw 
		// unreachable code block compilation error cause it won't be able to reach that area if it is
		// caught on the first catch block
		try {
			int n = 100/0;
			boolean isValid = accNo.startsWith("SBI"); // here it will throw exception while operating on null value
		} catch (NullPointerException e) {
			System.out.println("You are trying to use operation on null ");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Don't dividee anything with 0");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Unknown error");
			e.printStackTrace();
		}
		System.out.println("Account.doValidate() END");
	}
}
