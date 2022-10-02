package com.xworkz.inheritance.example.parent;

public class Planet {

	public boolean innerPlanet;
	public boolean rotateClockwise;
	public boolean isItHabitable;
	
	public Planet()
	{
		System.out.println("Inside Parent Planet Default constructor");
	}
	
	public Planet(boolean innerPlanet,boolean rotateClockwise,boolean isItHabitable)
	{
		this.innerPlanet=innerPlanet;
		this.rotateClockwise=rotateClockwise;
		this.isItHabitable=isItHabitable;
		System.out.println("Inside Parent Planet Boolean,Boolean,Boolean constructor");
		
	}
	
	public void show()
	{
		System.out.println(this.innerPlanet);
		System.out.println(this.rotateClockwise);
		System.out.println(this.isItHabitable);
	}
	
	
}
