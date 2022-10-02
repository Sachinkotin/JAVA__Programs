package com.xworkz.inheritance;

public class Plane {
	
	public String name;
	public int noOfSeats;
	public double cost;
	public int maxSpeed;
	public String pilotName;
	
	public void torisu()
	{
		System.out.println("Chopper Name is "+this.name);
		System.out.println("No of Seats is "+this.noOfSeats);
		System.out.println("Per hour charge is "+this.cost);
		System.out.println("Max speed in kmph is "+this.maxSpeed);
		System.out.println("Pilot Name is "+this.pilotName);
	}

}
