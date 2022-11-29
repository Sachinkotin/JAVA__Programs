package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RailwayStation {

	
	@Autowired
	private String railPlace;
	@Autowired
	private String railDist;
	@Autowired
	private RailwayStationTicketChecker rst;

	public RailwayStation() {
		System.out.println("Inside RailwayStation default constructor");
	}

	public String getRailPlace() {
		return railPlace;
	}

	public String getRailDist() {
		return railDist;
	}

	public void showCheckerDetails() {
		System.out.println("Ticket Checker is Male : " +rst.getIsCheckerMale() +"\n"+ "TC age is :  " + rst.getCheckerAge());
	}

}
