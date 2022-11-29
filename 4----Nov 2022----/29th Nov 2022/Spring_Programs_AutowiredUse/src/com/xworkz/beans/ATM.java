package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ATM {

	@Autowired
	private String atmName;
	@Autowired
	private String atmLandmark;
	@Autowired
	private ATMAirConditioner aac;

	public ATM() {
		System.out.println("Inside ATM default constructor");
	}

	public String getAtmName() {
		return atmName;
	}

	public String getAtmLandmark() {
		return atmLandmark;
	}

	public void showAcDetails() {
		System.out.println("Ac brand name is : " +aac.getAtmAcBrand() +"\n"+ "Ac costs Rs :  " + aac.getAtmAcCost());
	}

}
