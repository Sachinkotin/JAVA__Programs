package com.xworkz.runner;

import com.xworkz.inheritance.example.child.OnlineSuperMarket;
import com.xworkz.inheritance.example.chacha.Market;
import com.xworkz.inheritance.example.parent.SuperMarket;
public class MarketRunner {

	public static void main(String[] args) {

//  String name,String location,String gstNumber		
	Market mark1=new Market("Big Bazaar","BTM","2GSTN5417");

//	String name,String location,String gstNumber,String typeOfMarket,int pincode,int noOfStaff
	Market mark2=new SuperMarket("Zomato","K R Puram","2GSTN9874","Vegetable",591123,54);
	SuperMarket supmar1=new SuperMarket("Zepto","J P Nagar","2GSTN8774","Vegetable",587123,68);
	
	
//	String name,String location,String gstNumber,String typeOfMarket,int pincode,int noOfStaff,boolean DiscountAvailable,boolean freeDeliveryAvailable,long phoneNumber
	Market mark3=new OnlineSuperMarket("Mythri","K R Puram","2GSTN9874","Vegetables and Stationary Items",598123,84,true,false,7895445414L);
	
	if(mark3 instanceof OnlineSuperMarket )
	{
	OnlineSuperMarket osm1=(OnlineSuperMarket)mark3;
	osm1.torisu();
	System.out.println("Reference is pointing to OnlineSuperMarket");
	}
	else {
		
		System.out.println("Reference is Not pointing to OnlineSuperMarket");
		

	}
	
	SuperMarket supmar2=new OnlineSuperMarket("Kiran","Vijaynaagar","2GSTN8874","Vegetable",597123,54,true,true,6298745414L);
	if(supmar2 instanceof OnlineSuperMarket) {
	
	OnlineSuperMarket osm2=(OnlineSuperMarket)supmar2;
	osm2.torisu();
	System.out.println("Reference is pointing to OnlineSuperMarket");
	}
	else {
		
		System.out.println("Reference is Not pointing to OnlineSuperMarket");
		
	}
	
	OnlineSuperMarket osm3=new OnlineSuperMarket("Manju","K R Puram","2GSTN9844","Vegetable and Stationary Items",571123,54,true,true,9498745414L);
	osm3.torisu();
	
	
	
	
	
	
		
	
	}

}
