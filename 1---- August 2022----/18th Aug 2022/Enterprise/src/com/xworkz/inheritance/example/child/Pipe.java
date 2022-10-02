package com.xworkz.inheritance.example.child;

import com.xworkz.inheritance.example.parent.Plastic;


public class Pipe extends Plastic {
	
	public String brand;
	public int lengthInFeet;
	public int price;
	
	 public Pipe()
		{
			System.out.println("Inside a Child- Pipe Default Constructor");
		}
		
		public Pipe(String mfgPlace,boolean isItRecycle,double thicknessInNm,String brand,int lengthInFeet,int price)
		{
			super.mfgPlace=mfgPlace;
			super.isItRecycle=isItRecycle;
			super.thicknessInNm=thicknessInNm;
			this.brand=brand;
			this.lengthInFeet=lengthInFeet;
			this.price=price;
			System.out.println("Inside a Child- Pipe *super and this* String,Boolean,Double,String,int,int Constructor");
		}
		
		public void torisu()
		{
			System.out.println(super.mfgPlace);
			System.out.println(super.isItRecycle);
			System.out.println(super.thicknessInNm);
			System.out.println(this.brand);
			System.out.println(this.lengthInFeet);
			System.out.println(this.price);
		}

}
