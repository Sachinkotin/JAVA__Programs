package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrimarySchool {

	@Autowired
	private String schoolName;
	@Autowired
	private int schoolSince;
	@Autowired
	private PrimarySchoolHeadMaster psh;

	public PrimarySchool() {
		System.out.println("Inside PrimarySchool default constructor");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public int getSchoolSince() {
		return schoolSince;
	}

	public void showHmDetails() {
		System.out.println("Head Master name is : " +psh.getHmName() +"\n"+ "Experience in years is :  " +psh.getExperienceInYears());
	}

}
