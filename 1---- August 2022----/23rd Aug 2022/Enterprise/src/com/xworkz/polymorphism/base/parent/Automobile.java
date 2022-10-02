package com.xworkz.polymorphism.base.parent;

public class Automobile {
	
	public String type;//2 or 4 wheeler
	public String brand;
	
	public Automobile()
	{
		System.out.println("Inside a Automobile Default constructor");
	}
	
	public double sellAccesories(String name)
	{
		if (name=="Tyres")
		{	System.out.print("The Price of Tyres is :Rs ");
		    return 5000;
		}
		if (name=="Chain packet")
		{	System.out.print("The Price of Tyres is :Rs ");
	        return 1200;
		}
		if (name=="Clutch plate")
		{	System.out.println("The Price of Tyres is :Rs ");
		    return 3600;
		}
		if (name=="Mirrors")
		{	System.out.println("The Price of Tyres is :Rs ");
	        return 250;
		}
		if (name=="Clutch Cable")
		{	System.out.println("The Price of Tyres is :Rs ");
		    return 600;
		}
		if (name=="Brake wire")
		{	System.out.println("The Price of Tyres is :Rs ");
	        return 900;
		}
		else 
		{
			System.out.println("Provide valid accessories name ");
			return 0;
		}
	}
	
	public void setType()
	{
		this.type="2 Wheeler";
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	
	protected void torisu()
	{
		System.out.println(this.type);
		System.out.println(this.brand);
		
	}	
}


	   
		
	
	
	
	
	
	

	
	
	
	

