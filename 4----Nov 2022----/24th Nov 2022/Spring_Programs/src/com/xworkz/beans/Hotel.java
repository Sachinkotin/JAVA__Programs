package com.xworkz.beans;

public class Hotel {

	//Used in both SpringConfig.java and SpringConfig.xml
	private String name;
	public Hotel() {
		System.out.println("Inside default Hotel constructor");
	}
	
	public void showMenu()
	{
		System.out.println("Idli,Vada,Dosa,Bonda is available ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + "]";
	}
	
	
	
}
