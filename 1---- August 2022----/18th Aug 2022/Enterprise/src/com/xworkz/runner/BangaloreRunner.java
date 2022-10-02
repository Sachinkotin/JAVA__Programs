package com.xworkz.runner;


import com.xworkz.inheritance.example.parent.City;
import com.xworkz.inheritance.example.child.Bangalore;

public class BangaloreRunner {

	public static void main(String[] args) {

		Bangalore ban=new Bangalore("Kempegouda",true,true,"Bangalore",true,6);
		ban.torisu();
		System.out.println("**********************");

		City city=new Bangalore("Sachin",false,false,"Ramdurg",false,1);
		city.show();
		System.out.println("**********************");
		
		Bangalore converted=(Bangalore)city;
		converted.torisu();
		
	}

}
