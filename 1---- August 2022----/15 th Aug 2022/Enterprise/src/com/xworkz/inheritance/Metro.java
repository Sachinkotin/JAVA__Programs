package com.xworkz.inheritance;

public class Metro extends Train{

	public Metro(String name,int noOfBogis,int trainNo,boolean ticketFreeForFemale,boolean doUHaveMetroCard)
	{
		this.name=name;
		this.noOfBogis=noOfBogis;
		this.trainNo=trainNo;
		this.ticketFreeForFemale=ticketFreeForFemale;
		this.doUHaveMetroCard=doUHaveMetroCard;
		
		torisu();
		
	}
	
}
