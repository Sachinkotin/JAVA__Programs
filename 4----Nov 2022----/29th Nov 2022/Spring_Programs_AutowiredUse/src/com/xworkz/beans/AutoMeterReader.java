package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoMeterReader {

	
	@Autowired
	private boolean isMeterWorking;
	@Autowired
	private int costPerKm;
	

	public AutoMeterReader() {
		System.out.println("Inside default AutoMeterReader constructor");
	}

	public boolean getIsMeterWorking() {
		return isMeterWorking;
	}

	public int getCostPerKm() {
		return costPerKm;
	}
}
