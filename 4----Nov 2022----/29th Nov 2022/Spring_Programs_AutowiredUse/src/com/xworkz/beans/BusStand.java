package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusStand {

	
	@Autowired
	private String busStandName;
	@Autowired
	private String busStandDistrict;
	@Autowired
	private BusStandController bsc;

	public BusStand() {
		System.out.println("Inside BusStand default constructor");
	}

	public String getBusStandName() {
		return busStandName;
	}

	public String getBusStandDistrict() {
		return busStandDistrict;
	}

	public void showControllerDetails() {
		System.out.println("Bus Stand Controller name is : " +bsc.getBusStandControllerName() +"\n"+ "Controller Salary is Rs:  " + bsc.getControllerSalary());
	}

}
