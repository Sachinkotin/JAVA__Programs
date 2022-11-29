package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ICICIBankSecurity {

	@Autowired
	private String bankSecurityName;
	@Autowired
	private String bankSecurityVehicleBrand;
	

	public ICICIBankSecurity() {
		System.out.println("Inside default ICICIBankSecurity constructor");
	}

	public String getBankSecurityName() {
		return bankSecurityName;
	}

	public String getBankSecurityVehicleBrand(){
		
		return bankSecurityVehicleBrand;
	}
	
	
}
