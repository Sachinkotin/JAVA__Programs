package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Auto {

	@Autowired
	private String autoOwnerName;
	@Autowired
	private int autoCost;
	@Autowired
	private AutoMeterReader amr;

	public Auto() {
		System.out.println("Inside Auto default constructor");
	}

	public String getAutoOwnerName() {
		return autoOwnerName;
	}

	public int getAutoCost() {
		return autoCost;
	}

	public void showMeterDetails() {
		System.out.println("Is Auto Meter Working : " +amr.getIsMeterWorking() +"\n"+ "Cost Per Km in Rs:  " + amr.getCostPerKm());
	}

}
