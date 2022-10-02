package com.xworkz.inheritance.example.child;

import com.xworkz.inheritance.example.parent.SuperMarket;

public class OnlineSuperMarket extends SuperMarket {
	
	public boolean DiscountAvailable;
	public boolean freeDeliveryAvailable;
	public long phoneNumber;
	
	public OnlineSuperMarket()
	{
		System.out.println("inside a Default OnlineSuperMarket constructor");
		System.out.println("*************************************");
	}
	
	public OnlineSuperMarket(String name,String location,String gstNumber,String typeOfMarket,int pincode,int noOfStaff,boolean DiscountAvailable,boolean freeDeliveryAvailable,long phoneNumber)
	{
		super.name=name;
		super.location=location;
		super.gstNumber=gstNumber;
		super.typeOfMarket=typeOfMarket;
		super.pincode=pincode;
		super.noOfStaff=noOfStaff;
		this.DiscountAvailable=DiscountAvailable;
		this.freeDeliveryAvailable=freeDeliveryAvailable;
		this.phoneNumber=phoneNumber;
		System.out.println("inside a Child OnlineSuperMarket Str,Str,Str,Str,Int,Int,Boolean,Boolean,long constructor");
		System.out.println("*************************************");

	}
	
	

	
	public void torisu()
	{
		 System.out.println(super.name); 
		 System.out.println(super.location); 
		 System.out.println(super.gstNumber); 
		 System.out.println(super.typeOfMarket); 
		 System.out.println(super.pincode); 
	     System.out.println(super.noOfStaff); 
	     System.out.println(this.DiscountAvailable); 
	     System.out.println(this.freeDeliveryAvailable); 
	     System.out.println(this.phoneNumber); 
	    
	}

}
