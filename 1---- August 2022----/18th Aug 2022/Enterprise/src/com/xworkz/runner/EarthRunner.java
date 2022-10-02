package com.xworkz.runner;

import com.xworkz.inheritance.example.parent.Planet;
import com.xworkz.inheritance.example.child.Earth;

public class EarthRunner {

	public static void main(String[] args) {
		
		Earth eth=new Earth(true,true,true,"EARTH",1,6825);
		eth.torisu();
		System.out.println("**********************");

		Planet planet=new Earth(false,true,false,"EARTH",1,6825);
		planet.show();
		System.out.println("**********************");
		
		Earth converted=(Earth)planet;
		converted.torisu();

	}

}
