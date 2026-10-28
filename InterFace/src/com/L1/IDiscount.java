package com.L1;
/**
 *  Implementing interface class will force you to implement the all the method it has
 *  Over ride it in child classes
 *  
 *  IMP-->
 *  Interface Only have method with no logic Before Java 7 ;
 *  and always by default public and abstract
 *  
 *  
 *  can also hold the reference for the child classes
 */
public interface IDiscount {
	// Interface can't have an instance data every data will be final and static which belong to the class
	// By Default public static final int MAX_VALUE = 100;
	int MAX_VALUE = 100;
	// Internally it will always be written like this
	// public abstract void calculateDiscount(int amount , int discountRate);
	void calculateDiscount(int amount , int discountRate);
}
