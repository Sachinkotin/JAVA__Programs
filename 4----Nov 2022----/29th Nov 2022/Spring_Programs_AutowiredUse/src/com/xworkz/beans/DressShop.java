package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DressShop {
	@Autowired
	private String dressShopName;
	@Autowired
	private String dressShopArea;
	@Autowired
	private DressShopOwner dso;

	public DressShop() {
		System.out.println("Inside DressShop default constructor");
	}

	public String getDressShopName() {
		return dressShopName;
	}

	public String getDressShopArea() {
		return dressShopArea;
	}

	public void showOwnerDetails() {
		System.out.println("Owner resides at : " +dso.getShopOwnerResidenceArea() +"\n"+ "Owner vehicle brand is :  " +dso.getShopOwnerVehicleBrand());
	}

}
