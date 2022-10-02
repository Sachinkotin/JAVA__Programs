package com.xworkz.inheritance;

public class Monkey {

	public String name;
	public String color;
	public boolean isItMale;
	
	public Monkey(String name,String color,boolean isItMale)
	{
		this.name=name;
		this.color=color;
		this.isItMale=isItMale;
		
		
	}
	
	public void show()
	{
		System.out.println("Monkey details: ");
		System.out.println("Type : "+this.name);
		System.out.println("Color : "+this.color);
		System.out.println("Is it Male: "+this.isItMale);
		
		
	}
	
	
	
	
}
