package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaTrainingInstituteVehicle {

	@Autowired
	private String ownerName;
	@Autowired
	private String vehicleBrand;
	

	public JavaTrainingInstituteVehicle() {
		System.out.println("Inside default JavaTrainingInstituteVehicle constructor");
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}
	
}
