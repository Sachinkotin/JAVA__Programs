package com.xworkz.encapsulation.parent;

public class Try1 {
	
	public String name;
	public int pincode;
	
	public Try1()
	{
		System.out.println("Inside default Try1 constructor");
	}
	
	public Try1(String name, int pincode)
	{
		this.name=name;
		this.pincode=pincode;
		System.out.println("Inside Str,Int-- Try1 constructor");
	}
	public void add()
	{
		System.out.println("10");
	}

	public void torisu()
	{
		System.out.println("Inside Try1 class torisu method");
		System.out.println(this.name);
		System.out.println(this.pincode);
		
	}
}
