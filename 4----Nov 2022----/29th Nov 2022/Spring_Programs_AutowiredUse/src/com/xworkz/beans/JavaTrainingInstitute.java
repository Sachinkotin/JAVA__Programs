package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JavaTrainingInstitute {

	
	@Autowired
	private String instituteName;
	@Autowired
	private String instituteFounder;
	@Autowired
	private JavaTrainingInstituteVehicle jtv;

	public JavaTrainingInstitute() {
		System.out.println("Inside JavaTrainingInstitute default constructor");
	}

	public String getInstituteName() {
		return instituteName;
	}

	public String getInstituteFounder() {
		return instituteFounder;
	}

	public void showVehicleDetails() {
		System.out.println("Institute Name name is : " +jtv.getOwnerName() +"\n"+ "Institute Founder is :  " +jtv.getVehicleBrand());
	}

}
