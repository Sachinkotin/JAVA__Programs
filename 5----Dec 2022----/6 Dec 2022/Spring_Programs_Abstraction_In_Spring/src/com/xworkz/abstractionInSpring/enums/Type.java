package com.xworkz.abstractionInSpring.enums;

public enum Type {
	
	PREPAID("Charge is Rs250 per month"),POSTPAID("Charge is Rs300 per month");
	
	private String values;

	private Type(String values) {
		this.values = values;
	}
	
	public String getValues() {
		return values;
	}
	
	
	

}
