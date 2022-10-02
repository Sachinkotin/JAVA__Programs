package com.xworkz.inheritance;

public class Bat extends Wood {

	public double price;
	public boolean lightWeight;
	public String brand;
	
	public Bat(double price,boolean lightWeight,String brand)
	{
		super("Teak","Dandeli");
		this.price=price;
		this.lightWeight=lightWeight;
		this.brand=brand;
		
		toris();
	}
	
	public void torisu()
	{
		System.out.println("Bat price Rs : "+this.price);
		System.out.println("Is it lightWeight  : "+this.lightWeight);
		System.out.println("Brand Name: "+this.brand);
		

	}
	
}
