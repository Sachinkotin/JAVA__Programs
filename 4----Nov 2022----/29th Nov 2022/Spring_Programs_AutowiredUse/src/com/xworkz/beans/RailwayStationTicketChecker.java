package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RailwayStationTicketChecker {

	
	@Autowired
	private boolean isCheckerMale;
	@Autowired
	private int checkerAge;
	

	public RailwayStationTicketChecker() {
		System.out.println("Inside default RailwayStationTicketChecker constructor");
	}

	public boolean getIsCheckerMale() {
		return isCheckerMale;
	}

	public int getCheckerAge() {
		return checkerAge;
	}
}
