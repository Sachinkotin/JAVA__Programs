package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {

	@Autowired
	private String bikebrand;
	@Autowired
	private double bikecost;
	@Autowired
	private Horn horn;

	public Bike() {
		System.out.println("Inside Bike default constructor");
	}

	public String getBikebrand() {
		return bikebrand;
	}

	public double getBikecost() {
		return bikecost;
	}

	public void showHornDetails() {
		System.out.println("Horn cost is Rs : " + horn.getHorncost() +"\n"+ "Horn color is :  " + horn.getHorncolor());
	}

}
