package com.
StringBuilder;

public class QueryGenerator {

	public StringBuilder generateQuery(int salary, String emId) {
		StringBuilder sb = new StringBuilder("Select from * employee ");
		if (salary > 0) {
			sb.append("where salary > " + salary + ";");
		} else if (emId != null) {
			sb.append("where emId is : " + emId + ";");
		} else {
			sb.append(";");
		}
		return sb;
	}
}
