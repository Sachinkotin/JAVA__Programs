package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CinemaHall {

	
	@Autowired
	private String cinemaHallName;
	@Autowired
	private String cinemaHallFounder;
	@Autowired
	private CinemaHallOwner cho;

	public CinemaHall() {
		System.out.println("Inside CinemaHall default constructor");
	}

	public String getCinemaHallName() {
		return cinemaHallName;
	}

	public String getCinemaHallFounder() {
		return cinemaHallFounder;
	}

	public void showhallOwnerDetails() {
		System.out.println("Cinema Hall Owner name is : " +cho.getCinemaownerName() +"\n"+ "Cinema Hall Owner vehicle brand is :  " +cho.getCinemaownerVehicleBrand());
	}

}
