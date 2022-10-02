package com.xworkz.inheritance.example.chacha;

public class Market {
	
	public String name;
	public String location;
	public String gstNumber;
	
	public Market()
	{
		System.out.println("inside a Default Chacha Market constructor");
		System.out.println("*************************************");
	}
	
	public Market(String name,String location,String gstNumber)
	{
		this.name=name;
		this.location=location;
		this.gstNumber=gstNumber;
		System.out.println("inside a Chacha Market Str,Str,Str constructor");
		System.out.println("*************************************");

	}
	
	
}
