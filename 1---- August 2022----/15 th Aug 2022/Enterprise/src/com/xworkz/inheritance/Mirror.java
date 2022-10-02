package com.xworkz.inheritance;

public class Mirror extends Glass{

	public int price=20;
	public boolean isItlightWeight=true;
	public String size = "small";
	
	public void torisu()
	{
		show();
		System.out.println("Mirror Properties ");
		System.out.println(this.price);
		System.out.println(this.isItlightWeight);
		System.out.println(this.size);
		
		
		
	}
	
}
