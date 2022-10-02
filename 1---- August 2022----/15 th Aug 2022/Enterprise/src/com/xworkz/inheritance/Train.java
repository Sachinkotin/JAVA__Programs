package com.xworkz.inheritance;

public class Train {
	
	public String name;
	public int noOfBogis;
	public int trainNo;
	public boolean ticketFreeForFemale;
	public boolean doUHaveMetroCard;
	
	public void torisu()
	{
		System.out.println("Name : "+this.name);
		System.out.println("No of Bogis: "+this.noOfBogis);
		System.out.println("Train No : "+this.trainNo);
		System.out.println("Ticket free for female: "+this.ticketFreeForFemale);
		System.out.println("Do u have MetroCard: "+this.doUHaveMetroCard);
	}

}
