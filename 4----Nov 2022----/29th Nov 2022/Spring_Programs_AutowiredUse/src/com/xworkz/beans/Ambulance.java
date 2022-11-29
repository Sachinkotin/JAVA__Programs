package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Ambulance {

	@Autowired
	private String ambulanceDriverName;
	@Autowired
	private String ambulanceBrand;
	

	public Ambulance() {
		System.out.println("Inside default Ambulance constructor");
	}

	public String getAmbulanceDriverName() {
		return ambulanceDriverName;
	}

	public String getAmbulanceBrand() {
		return ambulanceBrand;
	}
	
	
	
}
