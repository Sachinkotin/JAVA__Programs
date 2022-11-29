package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeautyParlourAc {

	
	
	@Autowired
	private int acCost;
	@Autowired
	private String acBrand;
	

	public BeautyParlourAc() {
		System.out.println("Inside default BeautyParlourAc constructor");
	}

	public int getAcCost() {
		return acCost;
	}

	public String getAcBrand() {
		return acBrand;
	}
	
	
}
