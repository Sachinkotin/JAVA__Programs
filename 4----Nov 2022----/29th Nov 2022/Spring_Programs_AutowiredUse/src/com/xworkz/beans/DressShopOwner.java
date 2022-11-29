package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DressShopOwner {

	
	@Autowired
	private String shopOwnerResidenceArea;
	@Autowired
	private String shopOwnerVehicleBrand;
	

	public DressShopOwner() {
		System.out.println("Inside default DressShopOwner constructor");
	}

	public String getShopOwnerResidenceArea() {
		return shopOwnerResidenceArea;
	}

	public String getShopOwnerVehicleBrand() {
		return shopOwnerVehicleBrand;
	}
	
	
}
