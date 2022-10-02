package com.xworkz.polymorphism.base.runner;

import com.xworkz.polymorphism.base.parent.*;
import com.xworkz.polymorphism.base.TataAutomobile;
public class AutomobileRunner {

	public static void main(String[] args) {

	
	Automobile autom=new Automobile();
	autom.setBrand("Marti Suzuki");
	double khg=autom.sellAccesories("Chain packet");
	System.out.println(khg);
	System.out.println("**************************************************");
	
	HondaAutomobile ham=new HondaAutomobile("2 Wheeler","Bajaj");
	ham.setOpentime();
	ham.setClosetime();
	ham.torisu();
	System.out.println("**************************************************");
	
	TataAutomobile tata=new TataAutomobile("4 Wheeler","Skoda");
	tata.torisu();
	
	
	
		
	}

}
