package com.L5Marker;

public class DataCleaner {
	/**
	 * This method here only check the instance of object if it is then it will return true and execute the body
	 * @param obj
	 */
	public void clean(Object obj) {
		if(obj instanceof Cleanable) {
			System.out.println("You are authorized to clean the object");
		}else {
			System.out.println("You are not authorized to clean the objecct");
		}
	}
}
