package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CementFactorySecurityGuard {

	
	@Autowired
	private String cementSecurityName;
	@Autowired
	private String cementSecurityPlace;
	

	public CementFactorySecurityGuard() {
		System.out.println("Inside default CementFactorySecurityGuard constructor");
	}

	public String getCementSecurityName() {
		return cementSecurityName;
	}

	public String getCementSecurityPlace() {
		return cementSecurityPlace;
	}
}
