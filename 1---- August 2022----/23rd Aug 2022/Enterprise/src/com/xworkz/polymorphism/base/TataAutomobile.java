package com.xworkz.polymorphism.base;

import com.xworkz.polymorphism.base.parent.Automobile;
public class TataAutomobile extends Automobile{

	
	public TataAutomobile()
	{
		System.out.println("******Inside a TataAutomobile Default constructor*****");
	}
	
	public TataAutomobile(String type,String brand)
	{
		this.type=type;
		this.brand=brand;
	}
	
	@Override
	public void torisu()
	{
		System.out.println(this.type);
		System.out.println(this.brand);
		
	}
	
	
}
