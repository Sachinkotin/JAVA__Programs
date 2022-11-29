package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CinemaHallOwner {

	
	@Autowired
	private String cinemaOwnerName;
	@Autowired
	private String cinemaOwnerVehicleBrand;
	

	public CinemaHallOwner() {
		System.out.println("Inside default CinemaHallOwner constructor");
	}

	public String getCinemaownerName() {
		return cinemaOwnerName;
	}

	public String getCinemaownerVehicleBrand() {
		return cinemaOwnerVehicleBrand;
	}
}
