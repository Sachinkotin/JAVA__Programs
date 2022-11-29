package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GeneralStore {

	@Autowired
	private String generalStoreName;
	@Autowired
	private int generalStorePincode;
	@Autowired
	private GeneralStoreBroomStick gsbs;

	public GeneralStore() {
		System.out.println("Inside GeneralStore default constructor");
	}

	public String getGeneralStoreName() {
		return generalStoreName;
	}

	public int getGeneralStorePincode() {
		return generalStorePincode;
	}

	public void showBroomstickDetails() {
		System.out.println("BroomStick Brand name is : " +gsbs.getBroomstickBrandName()+"\n"+ "BroomStick Cost is Rs :" + gsbs.getBroomStickCost());
	}

}
