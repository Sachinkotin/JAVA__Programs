package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.*;
public class ITRuleRunner {

	public static void main(String[] args) {

		
		ITRuleFollower itf1= new ITRuleFollower();
		itf1.applyLeaves();
		itf1.harrasment();
		itf1.informLeaves();
		itf1.parkingApproval();
		itf1.swipecard();
		itf1.wfh();
		System.out.println("******************************");
		
		HRRules hrr1=(ITRuleFollower) itf1;
		hrr1.applyLeaves();
		hrr1.harrasment();
		System.out.println("******************************");
		
		SecurityRules sr1=(ITRuleFollower) itf1;
		sr1.parkingApproval();
		sr1.swipecard();
		System.out.println("******************************");
		
		ManagerRules mr1=(ITRuleFollower) itf1;
		mr1.informLeaves();
		mr1.wfh();
		System.out.println("******************************");
		
		
	}

}
