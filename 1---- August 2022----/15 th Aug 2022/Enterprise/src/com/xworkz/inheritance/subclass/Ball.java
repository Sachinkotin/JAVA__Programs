package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.Rubber;
public class Ball extends Rubber {

	
	public String color;
	public int price;
	public boolean isItSoft;
	
	public Ball(String color,int price,boolean isItSoft)
	{
		this.color=color;
		this.price=price;
		this.isItSoft=isItSoft;
	}
	
	public void torisu()
	{
		System.out.println("Rubber Manufacturing Place is: "+super.mfgPlace);
		System.out.println("Rubber Cost per kg is Rs : "+super.cost);
		
		System.out.println("Ball color is: "+this.color);
		System.out.println("Ball Price is: "+this.price);
		System.out.println("Is it Soft : "+this.isItSoft);
		
		
	}
	
}
