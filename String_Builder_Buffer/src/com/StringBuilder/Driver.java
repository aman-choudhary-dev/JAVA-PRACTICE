package com.StringBuilder;

public class Driver {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Kodewala"); // one object in SCP and one in Heap
		sb.append(" Academy"); // one in SCP for academy 
		// it will change the Kodewala Obj in heap and won't create any new obj
		// Total 3 obj  : 2 in SCP(Kodewala , Academy) and 1 in Heap (Kodewala Acadmey)
		System.out.println(sb);
	}
}
