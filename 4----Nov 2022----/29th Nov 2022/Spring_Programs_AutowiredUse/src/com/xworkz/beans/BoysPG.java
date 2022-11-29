package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoysPG {

	@Autowired
	private String boysPgName;
	@Autowired
	private String pgLocation;
	@Autowired
	private BoysPGCook bpc;

	public BoysPG() {
		System.out.println("Inside BoysPG default constructor");
	}

	public String getBoysPgName() {
		return boysPgName;
	}

	public String getPgLocation() {
		return pgLocation;
	}

	public void showCookDetails() {
		System.out.println("Cook name is : " +bpc.getPgCookName() +"\n"+ "Is Cook Married :  " + bpc.getIsCookMarried());
	}

	
	
	
}
