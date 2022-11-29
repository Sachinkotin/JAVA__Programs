package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Hotel {

	@Autowired
	private String hotelName;
	@Autowired
	private int hotelSince;
	@Autowired
	private Weightmachine mc;

	public Hotel() {
		System.out.println("Inside Hotel default constructor");
	}

	public String getHotelName() {
		return hotelName;
	}

	public int getHotelSince() {
		return hotelSince;
	}

	public void showWeightmachineDetails() {
		System.out.println("Weightmachine cost is Rs : " + mc.getWeightmachinecost() +"\n"+ "Weightmachine is it DIGITAL  :  " + mc.getWeightmachineisItDigital());
	}

	
}
