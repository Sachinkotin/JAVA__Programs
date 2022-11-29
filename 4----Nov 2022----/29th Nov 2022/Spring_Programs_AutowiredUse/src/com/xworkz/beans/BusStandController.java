package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusStandController {

	@Autowired
	private String busStandControllerName;
	@Autowired
	private int controllerSalary;
	

	public BusStandController() {
		System.out.println("Inside default BusStandController constructor");
	}

	public String getBusStandControllerName() {
		return busStandControllerName;
	}

	public int getControllerSalary() {
		return controllerSalary;
	}
	
}
