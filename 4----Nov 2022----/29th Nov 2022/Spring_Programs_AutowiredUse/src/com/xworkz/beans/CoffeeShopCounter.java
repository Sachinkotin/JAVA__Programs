package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoffeeShopCounter {

	
	@Autowired
	private boolean isHeMale;
	@Autowired
	private String counterPersonName;
	

	public CoffeeShopCounter() {
		System.out.println("Inside default CoffeeShopCounter constructor");
	}

	public boolean getIsHeMale() {
		return isHeMale;
	}

	public String getCounterPersonName() {
		return counterPersonName;
	}
}
