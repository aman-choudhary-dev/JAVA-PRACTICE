package com.Abstraction;

public class Account {
	void openAccount(String name) {
		System.out.println("Opening Account");
	}
}

class SavingAccount extends Account {
	// method name data type and its order should be same as the parent method to over ride the method
	// return type has to be same except the covariant 
	// access modifier should be same as parent method
	// imp --> you can widen the access of child method but can't shrink it for eg -> public can't become private but protected can become public
	// Private and static can't be Over ride if we try it will hide the parent method and call its own method
	// OVer riding is only possible in instance class and its method 
	@Override
	void openAccount(String id) {
		System.out.println("Opening Saving Account");
	}
}
