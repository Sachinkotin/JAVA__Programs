package com.xworkz.polymorphism;

public class Cricket {
	
	public String country;
	public String captain;
	public String gender;

	public Cricket()
	{
		System.out.println("Inside default Cricket constructor");
	}
	
	public Cricket(String country,String captain,String gender)
	{
		this.country=country;
		this.captain=captain;
		this.gender=gender;
	}
	
	public boolean entertainment()
	{
		System.out.println("Inside a Parent-- entertainment method and before overriding");
		System.out.println("Cricket is an Entertainment game");
		return true;
	}
	
	public double presentation()
	{
		System.out.println("Inside a Parent-- presentation method and before overriding");
		
		return 9;
	}
	
	
	
}
