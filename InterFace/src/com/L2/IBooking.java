package com.L2;
/**
 * Java 8 introduce new feauture such as ( default ) keyword method
 * 
 * Java 7 had BackWard Compatability   issue:->
 * it means new features added on future which will impact the code written by previous Dev
 * ( auto upgrade feature added on feature every class will have to implement it even if it doesn't want)
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
		connectTODB();
	}
	/** ---> JAVA 8
	 * Static method was also introduce in JAVA 8 for the 
	 * common utility that the implementing class might need
	 * 
	 * Its optional for the implementing class to use they can use it if they want or leave it
	 */
	public static void printTicket() {
		System.out.println("IBooking.printTicket()");
	}
	
	/**
	 *  JAVA - 9 -->
	 *  Introduce the ( ' private ' method )
	 *  
	 * 	There was an issue in 8 version where for the similar task in default method
	 * 	we have to write duplicate method like ( connecting to DB ) while sending 
	 * 	notification or any other call which need the DB connection
	 * 
	 *  so common code or duplicate code can be written inside the private method 
	 *  to avoid code duplication
	 *  
	 *  We can't call this method in static method since they belong to the class and 
	 *  this private method belongs to the object references 
	 *  @author aman
	 */
	private void connectTODB() {
		System.out.println("IBooking.connectTODB()");
	}
}
