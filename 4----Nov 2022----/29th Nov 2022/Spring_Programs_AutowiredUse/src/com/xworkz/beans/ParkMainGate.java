package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParkMainGate {

	@Autowired
	private String directionFacing;
	@Autowired
	private int gateHeightInFeet;
	

	public ParkMainGate() {
		System.out.println("Inside default ParkMainGate constructor");
	}

	public String getDirectionFacing() {
		return directionFacing;
	}

	public int getGateHeightInFeet() {
		return gateHeightInFeet;
	}
	
	
	
	
}
