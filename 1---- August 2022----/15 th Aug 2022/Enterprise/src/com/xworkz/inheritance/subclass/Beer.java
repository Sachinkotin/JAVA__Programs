package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.Alcohol;
public class Beer extends Alcohol {

	public int price;
	public String brand;
	public String mfgPlace;
	
	public Beer()
	{
		super.isItHealthy=false;
		super.isItSour=true;
		this.price=820;
		this.brand="Imperial Blue";
		this.mfgPlace="Goa";
	}
	
	public void torisu()
	{
		System.out.println("Alcohol Details:  ");
		System.out.println("Alcohol Is Helathy:  "+super.isItHealthy);
		System.out.println("Is it Tasting Sour:  "+super.isItSour);
		System.out.println();
		System.out.println("Beer Details:  ");
		System.out.println("Brand Name:  "+this.brand);
		System.out.println("Cost Rs : "+this.price);
		System.out.println("Manufacturing Place : "+this.mfgPlace);
		
	}
	
	
}
