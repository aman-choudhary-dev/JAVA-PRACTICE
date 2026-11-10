package com.L3;

/**
 * this annotation help the future dev from changing  the functional interface to normal interface
 * they may change the interface without knowing that it was functional interface 
 * 
 *  Functional Interface - Interface with only one abstract method it can have other method such as private,
 *  						   static or default method since all this have body they can't be called abstract
 */
@FunctionalInterface

/**
 * Functional Interface can be extended but the other interface should not have any abstract method cause it will
 * change the face the it can only have one abstract method
 */
public interface IAccount {
	/**
	 * To user lamda Expression in java they made these so that it can call this method without implementing it
	 * if it has only one method it know which one to call
	 */
	void openAccount();
}
