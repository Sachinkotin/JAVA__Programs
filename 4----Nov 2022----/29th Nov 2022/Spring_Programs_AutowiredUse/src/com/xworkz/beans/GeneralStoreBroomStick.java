package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GeneralStoreBroomStick {

	
	@Autowired
	private String broomstickBrandName;
	@Autowired
	private int broomStickCost;
	

	public GeneralStoreBroomStick() {
		System.out.println("Inside default GeneralStoreBroomStick constructor");
	}

	public String getBroomstickBrandName() {
		return broomstickBrandName;
	}

	public int getBroomStickCost() {
		return broomStickCost;
	}
}
