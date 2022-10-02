package com.xworkz.runner;

import com.xworkz.inheritance.example.parent.Keyboard;
import com.xworkz.inheritance.example.child.Touchpad; 
public class TouchpadRunner {

	public static void main(String[] args) {

		
		Touchpad tch=new Touchpad("Kia",25,true,"English",true,true);
		tch.torisu();
		System.out.println("**********************");
		
		Keyboard keyb=new Touchpad("Infinix",925,true,"German",true,true);
		keyb.show();
		System.out.println("Here keyb can access only properties and Behaviors of Parent class");
		System.out.println("**********************");
		
		Touchpad convertedFromParent=(Touchpad)keyb;
		convertedFromParent.torisu();
		System.out.println("**********************");
		
		
		
		
		
		
	}

}
