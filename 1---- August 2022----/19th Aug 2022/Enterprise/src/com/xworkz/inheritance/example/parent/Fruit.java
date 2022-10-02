package com.xworkz.inheritance.example.parent;

public class Fruit {

	
	public String name;
	public String color;
	public boolean isItSour;
	
	public Fruit()
	{
		System.out.println("Inside Parent Fruit Default constructor");
	}
	
	public Fruit(String name,String color,boolean isItSour)
	{
		this.name=name;
		this.color=color;
		this.isItSour=isItSour;
		System.out.println("Inside Parent Fruit String,String,Boolean constructor");
		
	}
	
	public void show()
	{
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.isItSour);
	}
	
}
