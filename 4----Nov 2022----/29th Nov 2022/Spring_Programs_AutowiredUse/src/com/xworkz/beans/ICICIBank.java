package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ICICIBank {

	@Autowired
	private String iciciBankLocation;
	@Autowired
	private String iciciPincode;
	@Autowired
	private ICICIBankSecurity ibs;

	public ICICIBank() {
		System.out.println("Inside ICICIBank default constructor");
	}

	public String getIciciBankLocation() {
		return iciciBankLocation;
	}

	public String getIciciPincode() {
		return iciciPincode;
	}

	public void showSecurityDetails() {
		System.out.println("Bank Security name is : " +ibs.getBankSecurityName() +"\n"+ "Bank Security Vehicle brand is :  " + ibs.getBankSecurityVehicleBrand());
	}

	
	
}
