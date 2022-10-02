package com.xworkz.inheritance.example.parent;

public class City {

      
      public String founder;
      public boolean isItDistrict;
      public boolean isItSmartCity;
      
      
      public City()
  	{
  		System.out.println("Inside Parent City Default constructor");
  	}
  	
  	public City(String founder,boolean isItDistrict,boolean isItSmartCity)
  	{
  		this.founder=founder;
  		this.isItDistrict=isItDistrict;
  		this.isItSmartCity=isItSmartCity;
  		System.out.println("Inside Parent City String,Boolean,Boolean constructor");
  		
  	}
  	
  	public void show()
  	{
  		System.out.println(this.founder);
  		System.out.println(this.isItDistrict);
  		System.out.println(this.isItSmartCity);
  	}
  	
      
}
