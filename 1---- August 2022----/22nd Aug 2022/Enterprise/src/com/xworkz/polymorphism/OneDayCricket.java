package com.xworkz.polymorphism;

public class OneDayCricket extends Cricket {
	
	public String bestBowler;
	public String bestBatsman;
	
	public double presentation()
	{
		System.out.println("Inside OneDayCricket - double presentation after Method overiding");
		return 6;
	}

	public boolean entertainment()
	{
		System.out.println("Inside OneDayCricket - double entertainment after Method overiding");
		return false;
	}
	
	public OneDayCricket(String country,String captain,String gender, String bestBowler,String bestBatsman)
	{
		super.country=country;
		super.captain=captain;
		super.gender=gender;
		this.bestBowler=bestBowler;
		this.bestBatsman=bestBatsman;
	}
	
	public String manOfSeries()
	{
		System.out.println("Man of Series is : ");
		return "Sachin Tendulkar";
	}

	
	
}
