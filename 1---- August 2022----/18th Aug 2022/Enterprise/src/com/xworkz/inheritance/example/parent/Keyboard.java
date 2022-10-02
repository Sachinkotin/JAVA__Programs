package com.xworkz.inheritance.example.parent;

public class Keyboard {
	
	public String brand;
	public int buttons;
	public boolean fnKeyWorking;
	
	public Keyboard()
	{
		System.out.println("Inside Parent Keyboard Default constructor");
	}
	
	public Keyboard(String brand,int buttons,boolean fnKeyWorking)
	{
		this.brand=brand;
		this.buttons=buttons;
		this.fnKeyWorking=fnKeyWorking;
		System.out.println("Inside Parent Keyboard String,Int,Boolean constructor");
		
	}
	
	public void show()
	{
		System.out.println(this.brand);
		System.out.println(this.buttons);
		System.out.println(this.fnKeyWorking);
	}
	
	
	
}
