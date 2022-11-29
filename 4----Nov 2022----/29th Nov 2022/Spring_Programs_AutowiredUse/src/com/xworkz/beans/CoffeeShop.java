package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CoffeeShop {

	
	@Autowired
	private String coffeeShopName;
	@Autowired
	private String coffeeShopLocation;
	@Autowired
	private CoffeeShopCounter csc;

	public CoffeeShop() {
		System.out.println("Inside CoffeeShop default constructor");
	}

	public String getCoffeeShopName() {
		return coffeeShopName;
	}

	public String getCoffeeShopLocation() {
		return coffeeShopLocation;
	}

	public void showCounterDetails() {
		System.out.println("Person sitting at counter is male : " +csc.getIsHeMale() +"\n"+ "Person Name is :  " +csc.getCounterPersonName());
	}

}
