package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TailorShop {

	
	@Autowired
	private int tailorRent;
	@Autowired
	private String tailorLocation;
	@Autowired
	private TailorShopSpeaker tss;

	public TailorShop() {
		System.out.println("Inside TailorShop default constructor");
	}

	public int getTailorRent() {
		return tailorRent;
	}

	public String getTailorLocation() {
		return tailorLocation;
	}

	public void showSpeakerDetails() {
		System.out.println("Tailor Speaker name is : " +tss.getTailorSpeakerBrand() +"\n"+ "Tailor Speaker cost is Rs:  " + tss.getTailorSpeakerCost());
	}

}
