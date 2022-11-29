package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Horn {

	@Autowired
	private double horncost;
	@Autowired
	private String horncolor;

	public Horn() {
		System.out.println("Inside Horn default constructor");
	}

	public double getHorncost() {
		return horncost;
	}

	public String getHorncolor() {
		return horncolor;
	}

}
