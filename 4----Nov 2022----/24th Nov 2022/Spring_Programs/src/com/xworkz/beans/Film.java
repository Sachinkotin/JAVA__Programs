package com.xworkz.beans;

public class Film {

	private String name;

	public Film() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Film [name=" + name + "]";
	}

}
