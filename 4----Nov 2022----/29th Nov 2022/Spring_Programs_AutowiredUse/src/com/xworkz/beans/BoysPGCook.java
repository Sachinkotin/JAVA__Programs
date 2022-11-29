package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoysPGCook {

	@Autowired
	private String pgCookName;
	@Autowired
	private boolean isCookMarried;
	

	public BoysPGCook() {
		System.out.println("Inside default BoysPGCook constructor");
	}

	public String getPgCookName() {
		return pgCookName;
	}

	public boolean getIsCookMarried() {
		return isCookMarried;
	}
	
}
