package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrimarySchoolHeadMaster {

	@Autowired
	private String hmName;
	@Autowired
	private int experienceInYears;
	

	public PrimarySchoolHeadMaster() {
		System.out.println("Inside default PrimarySchoolHeadMaster constructor");
	}

	public String getHmName() {
		return hmName;
	}

	public int getExperienceInYears() {
		return experienceInYears;
	}
	
}
