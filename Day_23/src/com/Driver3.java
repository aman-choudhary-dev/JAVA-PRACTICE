package com;

public class Driver3 {
	public static void main(String[] args) {
		String s = "This " + "is from" + " Kodewala Academy"; // it will only create one object in SCP cause it running during compile time and
															//it will be concatenated at that time
		// all 3 strings above doesn't have any assigned variable so they will be compile
		String s2 = "Kodewala"; // will be on scp
		String s3 = " Academy"; // also scp
		String s4 = s2 + s3; // this will be created only inside the HEap memory cause it happening during runtime and anything done during runtime is stored insde heap
		System.out.println(s);
		System.out.println(s4);
		String s5 = "Kodewala Academy";
		//( "  +  " is used to concat the strings but this " + " used string builder to concat the strings  )
		System.out.println(s4 == s5); // give false cause s4 is pointing at heap and s5 in SCP
		System.out.println(s4.intern() == s5); // intern call the SCP and check if the object is in the scp if it is it will start pointing it reference
											// to scp object instead of heap IF not then it will create one in scp and start pointing
		System.out.println(s4 == s5);
	}
}
// RUNTIME -- > Heap
// COMPILE -- > SCP