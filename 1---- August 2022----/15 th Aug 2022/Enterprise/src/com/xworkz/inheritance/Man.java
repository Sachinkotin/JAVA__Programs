package com.xworkz.inheritance;

public class Man extends Monkey {

	
	public String name="Prakash";
	public String color="Fair";
	public Man()
	{
		super("Ape","Brown",true);
		
		show();
		
	}
	
	
	
	public void torisu()
	{
		System.out.println();
		System.out.println("Man details: ");
		System.out.println("Name  : "+this.name);
		System.out.println("Color : "+this.color);
		
		
	}
}
