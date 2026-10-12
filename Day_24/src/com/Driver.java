package com;
// Final Method CLass or Variable cannot be override 
// Anything with final will not be change in any way
class AccountMgmt{  // if we declare this class final as (final class AcccountMgmt) i won't be able to extend it
	// Final Variable are Constants And their naming convention will be always CAPITAL LETTERS
	final int UPI_LIMIT = 100000; // This variable cannot be changed 
	//public final void doSomething() { // cannot be override in the child class
		
	//}
	public void doSomething1() {
		
	}
}
class Account extends AccountMgmt{
	public void doSomething() {   //  Its throwing an error cause i am trying to override the final method
		
	}
	@Override
	public void doSomething1() { // This can be override cause it doesn't have final
		
	}
}

public class Driver {
	public static void main(String[] args) {
		
	}
}
