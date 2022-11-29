package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Weightmachine {

	@Autowired
	private double weightmachinecost;
	@Autowired
	private boolean weightmachineisItDigital;

	public Weightmachine() {
		System.out.println("Inside default Weightmachine constructor");
	}

	public double getWeightmachinecost() {
		return weightmachinecost;
	}

	public boolean getWeightmachineisItDigital() {
		return weightmachineisItDigital;
	}
}
