package com.StringBuilder;

public class Driver1 {
	public static void main(String[] args) {
		QueryGenerator query = new QueryGenerator();
		StringBuilder sb = query.generateQuery(12000, null);
		System.out.println(sb);
	}
}
