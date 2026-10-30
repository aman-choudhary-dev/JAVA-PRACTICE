package com.L2;
/**
 * Java 8 introduce new feauture such as ( default ) keyword method
 * 
 * Java 7 had BackWard Compatability   issue:->
 * 			it means new features added on future which will impact the code written by previous Dev
 * 			( auto upgrade feature added on feature every class will have to implement it even if it doesn't want)
 * Java 8 Introduce default to make those method optional so that they can only be implement 
 * by those class who want to add those		
 * 
 * 	Here ( ' default ' is not a access modifier its a keyword)
 * 
 * its used when u don't want to make it compulsory for other classes to implement it
 */
public interface IBooking {
	void book();
	void cancelBook();
	/**
	 * this doesn't need to be implement by every class that is implementing this interface
	 * it will be implemented by those classes who want an auto upgrade feature
	 */
	public default void autoUpgrade() {
		
	}
}
