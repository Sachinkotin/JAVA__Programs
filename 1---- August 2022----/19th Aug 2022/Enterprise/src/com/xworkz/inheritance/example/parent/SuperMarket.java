package com.xworkz.inheritance.example.parent;

import com.xworkz.inheritance.example.chacha.Market;
public class SuperMarket extends Market {
	
	public String typeOfMarket;
	public int pincode;
	public int noOfStaff;

	public SuperMarket()
	{
		System.out.println("inside a Default SuperMarket constructor");
		System.out.println("*************************************");
	}
	
	public SuperMarket(String name,String location,String gstNumber,String typeOfMarket,int pincode,int noOfStaff)
	{
		super.name=name;
		super.location=location;
		super.gstNumber=gstNumber;
		this.typeOfMarket=typeOfMarket;
		this.pincode=pincode;
		this.noOfStaff=noOfStaff;
		System.out.println("inside a Parent SuperMarket Str,Str,Str,Str,Int,Int constructor");
		System.out.println("*************************************");

	}
	
	
	
}
