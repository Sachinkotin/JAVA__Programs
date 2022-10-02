package com.xworkz.polymorphism;

public class T20Cricket extends Cricket {
	
	public String manOfTheMatch()
	{
		System.out.println("Man of Match is : ");
		return "M S Dhoni";
	}

	public boolean entertainment()
	{
		return true;
	}
	
	public T20Cricket (String country,String captain,String gender)
	{
		super.country=country;
		super.captain=captain;
		super.gender=gender;
	}
}
