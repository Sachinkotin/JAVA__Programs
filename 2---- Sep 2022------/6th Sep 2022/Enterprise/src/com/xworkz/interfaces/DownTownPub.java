package com.xworkz.interfaces;

public class DownTownPub {

	private PubRule pubRule;
	
	public DownTownPub(PubRule pubRule)
	{
	 this.pubRule=pubRule;
	}
	
	public boolean checkRule()
	{
		boolean dress=pubRule.dressCodeFollowed();
		int age =pubRule.age();
		boolean valid=pubRule.validProof();
		
		if(dress && age>20 && valid)
		{
			System.out.println("Pub Rule Followed");
			return true;
		}
		else {
			System.err.println("Pub Rule NOT Follwed");
			return false;
		}
	}
}
