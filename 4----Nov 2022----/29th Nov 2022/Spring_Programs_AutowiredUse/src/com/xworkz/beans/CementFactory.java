package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CementFactory {

	
	@Autowired
	private String cementOwnerName;
	@Autowired
	private String cementPlace;
	@Autowired
	private CementFactorySecurityGuard csb;

	public CementFactory() {
		System.out.println("Inside CementFactory default constructor");
	}

	public String getCementOwnerName() {
		return cementOwnerName;
	}

	public String getCementPlace() {
		return cementPlace;
	}

	public void showGuardDetails() {
		System.out.println("Security name is : " +csb.getCementSecurityName() +"\n"+ "Security Place is :  " + csb.getCementSecurityPlace());
	}

}
