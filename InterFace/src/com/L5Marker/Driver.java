package com.L5Marker;

public class Driver {
	public static void main(String[] args) {
		User user = new User("Aman" , "BTM BANGALORE");
		DataCleaner dataCleaner = new DataCleaner(); // This Object only job is to check if it is a instance or not
		dataCleaner.clean(user);
	}
}
