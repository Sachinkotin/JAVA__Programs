package com.xworkz.inheritance.example.child;

import com.xworkz.inheritance.example.parent.Planet;
public class Earth extends Planet {
	
	public String name;
	public int noOfMoons;
	public double radius;

	
	public Earth()
	{
		System.out.println("Inside a Child- Earth Default Constructor");
	}
	
	public Earth(boolean innerPlanet,boolean rotateClockwise,boolean isItHabitable,String name,int noOfMoons,double radius)
	{
		super.innerPlanet=innerPlanet;
		super.rotateClockwise=rotateClockwise;
		super.isItHabitable=isItHabitable;
		this.name=name;
		this.noOfMoons=noOfMoons;
		this.radius=radius;
		System.out.println("Inside a Child- Earth *super and this* Boolean,Boolean,Boolean,String,Int,double Constructor");
	}
	
	public void torisu()
	{
		System.out.println(super.innerPlanet);
		System.out.println(super.rotateClockwise);
		System.out.println(super.isItHabitable);
		System.out.println(this.name);
		System.out.println(this.noOfMoons);
		System.out.println(this.radius);
		
	}
	
}
