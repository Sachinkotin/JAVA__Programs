package com.xworkz.runner;

import com.xworkz.inheritance.example.parent.Fruit;
import com.xworkz.inheritance.example.child.Mango;
public class MangoRunner {

	public static void main(String[] args) {

		Mango mango=new Mango("MANGO","Yellow",true,250.0,false,true);
		mango.torisu();
		System.out.println("**********************");

		Fruit fruit=new Mango("MANGO","Green",true,450.0,false,true);
		fruit.show();
		System.out.println("**********************");
		
		Mango converted=(Mango)fruit;
		converted.torisu();
		
		
	}

}
