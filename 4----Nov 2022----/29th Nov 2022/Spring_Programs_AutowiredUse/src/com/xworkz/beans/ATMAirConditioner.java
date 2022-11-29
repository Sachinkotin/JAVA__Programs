package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ATMAirConditioner {

	
	@Autowired
	private int atmAcCost;
	@Autowired
	private String atmAcBrand;
	

	public ATMAirConditioner() {
		System.out.println("Inside default ATMAirConditioner constructor");
	}

	public int getAtmAcCost() {
		return atmAcCost;
	}

	public String getAtmAcBrand() {
		return atmAcBrand;
	}
	
	
}
