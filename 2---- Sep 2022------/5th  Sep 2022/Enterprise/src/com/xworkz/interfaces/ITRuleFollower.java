package com.xworkz.interfaces;

public class ITRuleFollower implements HRRules,SecurityRules,ManagerRules{

	
	@Override
	public boolean applyLeaves() {
		System.out.println(" applyLeaves facility is available");
		return true;
	}
	
	@Override
	public boolean harrasment() {
		System.out.println("u can complain to HR about harrasment in any form ");
		return true;
	}
	
	@Override
	public boolean swipecard() {
		System.out.println("Id Card must be swiped before entering office");

		return true;
	}
	@Override
	public boolean parkingApproval() {
		System.out.println("For Parking u need to get approval from Security team");

		return true;
	}
	@Override
	public boolean informLeaves() {
		System.out.println("informLeaves facility available");

		return true;
	}
	@Override
	public boolean wfh() {
		System.out.println("work from home facility available");

		return true;
	}
}
