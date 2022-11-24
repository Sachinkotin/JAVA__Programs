package com.xworkz.beans;

public class Park {

	// used it in SpringConfigrn.java
	private String name;

	public Park() {
		System.out.println("Inside default Park constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showPark() {
		System.out.println("Park name is BTM Park");
	}

	@Override
	public String toString() {
		return "Park [name=" + name + "]";
	}

}
