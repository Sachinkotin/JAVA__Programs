package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

	@Autowired
	private String hospitalName;
	@Autowired
	private String hospitalFounder;
	@Autowired
	private Ambulance amb;

	public Hospital() {
		System.out.println("Inside Hospital default constructor");
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public String getHospitalFounder() {
		return hospitalFounder;
	}

	public void showAmbulanceDetails() {
		System.out.println("Ambulance driver name is : " +amb.getAmbulanceDriverName() +"\n"+ "Ambulance brand is :  " + amb.getAmbulanceBrand());
	}

	
}
