package com.xworkz.inheritance.example.child;

import com.xworkz.inheritance.example.parent.Keyboard;
public class Touchpad extends Keyboard {
	
	public String language;
	public boolean emojiAvailable;
	public boolean fingerTapAvailable;
	
	public Touchpad()
	{
		System.out.println("Inside a Child- Touchpad Default Constructor");
	}
	
	public Touchpad(String brand,int buttons,boolean fnKeyWorking,String language,boolean emojiAvailable,boolean fingerTapAvailable)
	{
		super.brand=brand;
		super.buttons=buttons;
		super.fnKeyWorking=fnKeyWorking;
		this.language=language;
		this.emojiAvailable=emojiAvailable;
		this.fingerTapAvailable=fingerTapAvailable;
		System.out.println("Inside a Child- Touchpad *super and this* String,Int,Boolean,String,Boolean,Boolean Constructor");
	}
	
	public void torisu()
	{
		System.out.println(super.brand);
		System.out.println(super.buttons);
		System.out.println(super.fnKeyWorking);
		System.out.println(this.language);
		System.out.println(this.emojiAvailable);
		System.out.println(this.fingerTapAvailable);
		
	}

}
