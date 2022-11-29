package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Park {

	
	@Autowired
	private String parkName;
	@Autowired
	private String parkArea;
	@Autowired
	private ParkMainGate pmg;

	public Park() {
		System.out.println("Inside Park default constructor");
	}

	public String getParkName() {
		return parkName;
	}

	public String getParkArea() {
		return parkArea;
	}

	public void showParkMainGateDetails() {
		System.out.println("Gate is facing towords Direction : " +pmg.getDirectionFacing() +"\n"+ "Gate Height in feet is :  " + pmg.getGateHeightInFeet());
	}

}
