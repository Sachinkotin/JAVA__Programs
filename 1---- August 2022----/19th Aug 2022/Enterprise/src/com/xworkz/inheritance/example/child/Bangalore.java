package com.xworkz.inheritance.example.child;

import com.xworkz.inheritance.example.parent.City;
public class Bangalore extends City {
	
	public String name;
    public boolean isItMetroCity;
    public int popnInCr;
    
    public Bangalore()
	{
		System.out.println("Inside a Child- Bangalore Default Constructor");
	}
	
	public Bangalore(String founder,boolean isItDistrict,boolean isItSmartCity,String name,boolean isItMetroCity,int popnInCr)
	{
		super.founder=founder;
		super.isItDistrict=isItDistrict;
		super.isItSmartCity=isItSmartCity;
		this.name=name;
		this.isItMetroCity=isItMetroCity;
		this.popnInCr=popnInCr;
		System.out.println("Inside a Child- Bangalore *super and this* String,Boolean,Boolean,String,Boolean,int Constructor");
	}
	
	public void torisu()
	{
		System.out.println(super.founder);
		System.out.println(super.isItDistrict);
		System.out.println(super.isItSmartCity);
		System.out.println(this.name);
		System.out.println(this.isItMetroCity);
		System.out.println(this.popnInCr);
	}
}

	
	

