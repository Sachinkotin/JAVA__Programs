package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.Actor;
public class Sudeep extends Actor{
	
	public Sudeep()
	{
		super.name="Kiccha";
		super.isHeSmart=true;
		super.age=35;
		super.color="White";
		super.height=180;
	}

	public void torisu()
	{
		System.out.println("Actor name : "+super.name);
		System.out.println("Is He Smart : "+super.isHeSmart);
		System.out.println("Age  : "+super.age);
		System.out.println("Color is : "+super.color);
		System.out.println("Height is : "+super.height+" cm");
		
	}
}
