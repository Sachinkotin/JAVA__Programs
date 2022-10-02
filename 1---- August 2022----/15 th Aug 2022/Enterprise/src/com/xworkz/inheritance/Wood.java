package com.xworkz.inheritance;

public class Wood {

	public String name;
	public String mfgPlace;
	
	public Wood(String name,String mfgPlace)
	{
		this.name=name;
		this.mfgPlace=mfgPlace;
	}
	
	public void toris()
	{
		System.out.println("Wood Name: "+this.name);
		System.out.println("Mfg Place : "+this.mfgPlace);
	}
}
