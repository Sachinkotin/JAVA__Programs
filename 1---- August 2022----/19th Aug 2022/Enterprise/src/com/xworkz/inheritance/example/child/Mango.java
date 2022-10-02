package com.xworkz.inheritance.example.child;

import com.xworkz.inheritance.example.parent.Fruit;

public class Mango extends Fruit {

	public double price;
	public boolean isItAvailableInAllSeasons;
	public boolean doYouLikeIt;
	
	public Mango()
	{
		System.out.println("Inside a Child- Mango Default Constructor");
	}
	
	public Mango(String name,String color,boolean isItSour,double price,boolean isItAvailableInAllSeasons,boolean doYouLikeIt)
	{
		super.name=name;
		super.color=color;
		super.isItSour=isItSour;
		this.price=price;
		this.isItAvailableInAllSeasons=isItAvailableInAllSeasons;
		this.doYouLikeIt=doYouLikeIt;
		System.out.println("Inside a Child- Mango *super and this* String,String,Boolean,double,Boolean,Boolean Constructor");
	}
	
	public void torisu()
	{
		System.out.println(super.name);
		System.out.println(super.color);
		System.out.println(super.isItSour);
		System.out.println(this.price);
		System.out.println(this.isItAvailableInAllSeasons);
		System.out.println(this.doYouLikeIt);
		
	}
	
}
