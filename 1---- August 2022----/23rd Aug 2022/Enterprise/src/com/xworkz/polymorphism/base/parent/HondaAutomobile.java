package com.xworkz.polymorphism.base.parent;

public class HondaAutomobile extends Automobile {

	public double openTime;
	public double closeTime;
	
	
	public HondaAutomobile()
	{

		System.out.println("Inside a HondaAutomobile Default constructor");
	}
	
	public void setOpentime()
	{
		this.openTime=9.30;
	}
	
	public void setClosetime()
	{
		this.closeTime=6.30;
	}
	public HondaAutomobile(String type,String brand)
	{
		System.out.println("Inside a HondaAutomobile Str,Str constructor");
		super.type=type;
		super.brand=brand;
	}
	
	
	@Override
	public void torisu()
	{
		System.out.println(super.type);
		System.out.println(super.brand);
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}
	
	
	
}
