package com.xworkz.inheritance;

public class Cycle {

	public String brand;
	public String mfgPlace;
	public double price;
	public String color;
	public boolean anyDiscount;
	
	public Cycle(String brand,String mfgPlace,double price,String color,boolean anyDiscount)
	{
		this.brand=brand;
		this.mfgPlace=mfgPlace;
		this.price=price;
		this.color=color;
		this.anyDiscount=anyDiscount;
		
	}
	
	public void torisu()
	{
		System.out.println("Brand name : "+this.brand);
		System.out.println("Mfg Place : "+this.mfgPlace);
		System.out.println("Price : "+this.price);
		System.out.println("Color : "+this.color);
		System.out.println("Any Offer Available : "+this.anyDiscount);
		
	}
}
