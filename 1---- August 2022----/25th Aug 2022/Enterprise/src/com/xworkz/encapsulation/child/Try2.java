package com.xworkz.encapsulation.child;

import com.xworkz.encapsulation.parent.Try1;

public class Try2 extends Try1{
	
	public String place;
	public String area;
	
	public Try2()
	{
		System.out.println("Inside ***default Try2**** constructor");
	}
	
	public Try2(String name, int pincode,String place,String area)
	{
		super.name=name;
		super.pincode=pincode;
		this.place=place;
		this.area=area;
		System.out.println("Inside Str,Int,Str,Str-- Try2 constructor");
		
	}
	public void sum()
	{
		System.out.println("20");
	}

	public void torisu()
	{
		System.out.println("Inside Try2 class torisu method");
		System.out.println(super.name);
		System.out.println(super.pincode);
		System.out.println(this.place);
		System.out.println(this.area);
	}

}
