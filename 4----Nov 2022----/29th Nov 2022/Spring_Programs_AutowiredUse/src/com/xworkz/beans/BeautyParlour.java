package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeautyParlour {

	
	@Autowired
	private String parlourName;
	@Autowired
	private long parlourPhoneNumber;
	@Autowired
	private BeautyParlourAc bpa;

	public BeautyParlour() {
		System.out.println("Inside BeautyParlour default constructor");
	}

	public String getParlourName() {
		return parlourName;
	}

	public long getParlourPhoneNumber() {
		return parlourPhoneNumber;
	}

	public void showAcDetails() {
		System.out.println("AC brand name is : " +bpa.getAcBrand() +"\n"+ "AC cost is :  " + bpa.getAcCost());
	}

	
}
