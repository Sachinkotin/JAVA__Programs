package com.xworkz.jdbcStart.enumClass;

public enum MySQLDBCredentials {

	URL("jdbc:mysql://localhost:3306/jdbc"), USERNAME("root"), SECRET("Xworkzodc@123");

	private String values;

	private MySQLDBCredentials(String values) {
		this.values = values;
	}

	public String getValues() {
		return values;
	}

}
