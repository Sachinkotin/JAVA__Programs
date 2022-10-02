package com.xworkz.polymorphism;

public class TestCricket extends Cricket {

	public String groundType;
	
	@Override
	public double presentation()
	{
		System.out.println("Inside TestCricket double presentation and it is method Overriding  ");
		return 5.0;
	}
	
	public TestCricket()
	{
		System.out.println("Inside default TestCricket constructor");
	}
	
	public TestCricket(String country,String captain,String gender,String groundType)
	{
		
		super.country=country;
		super.captain=captain;
		super.gender=gender;
		this.groundType=groundType;
	}
	
	
}
