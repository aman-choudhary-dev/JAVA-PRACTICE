package com.L4Marker;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account acc = new Account("Aman", "564684");
		Account acc1 = (Account)acc.clone(); // cloning acc 0object to the acc1 
		System.out.println(acc1.name);
		/**
		 * How implementing cloneable give ability to clone by givingpermission it check InstanceOf to check
		 */
		if(acc instanceof Cloneable) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
