package com.Revision.Polymorphism;

class Deleivery {
	void doSomething() {
		System.out.println("Deleivery ........");
	}
}

class ExpressBee extends Deleivery {
	@Override
	void doSomething() {
		System.out.println("ExpressBee Deleivery....");
	}
}

public class Driver {
	public static void main(String[] args) {
		Deleivery d = new ExpressBee(); // Auto UpCasting
		d.doSomething();
		// Object don't get down casted only the reference can be down casted
		// Only possible if the reference hold the object it being downcast to..
		ExpressBee e= (ExpressBee) d; //DownCasting the reference of expressbee
		e.doSomething();
		// Compile time --> IT check if the doSomething method is available is available on the refrence or not
		// Runtime   --> It will check the object and call the method of object if not availble
		// 				then it will call the super calss or OBJECT class in the end if its not availble then it will 
		//				throw an compile time error
	}
}
