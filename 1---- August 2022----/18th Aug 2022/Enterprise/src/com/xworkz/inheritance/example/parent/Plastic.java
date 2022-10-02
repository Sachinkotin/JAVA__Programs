package com.xworkz.inheritance.example.parent;

public class Plastic {
	
	
	public String mfgPlace;
	public boolean isItRecycle;
	public double thicknessInNm;
	
	  public Plastic()
	  	{
	  		System.out.println("Inside Parent Plastic Default constructor");
	  	}
	  	
	  	public Plastic(String mfgPlace,boolean isItRecycle,double thicknessInNm)
	  	{
	  		this.mfgPlace=mfgPlace;
	  		this.isItRecycle=isItRecycle;
	  		this.thicknessInNm=thicknessInNm;
	  		System.out.println("Inside Parent Plastic String,Boolean,Boolean constructor");
	  		
	  	}
	  	
	  	public void show()
	  	{
	  		System.out.println(this.mfgPlace);
	  		System.out.println(this.isItRecycle);
	  		System.out.println(this.thicknessInNm);
	  	}
	
	

}
