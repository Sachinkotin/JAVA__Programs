package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TailorShopSpeaker {

	@Autowired
	private String tailorSpeakerBrand;
	@Autowired
	private int tailorSpeakerCost;
	

	public TailorShopSpeaker() {
		System.out.println("Inside default TailorShopSpeaker constructor");
	}

	public String getTailorSpeakerBrand() {
		return tailorSpeakerBrand;
	}

	public int getTailorSpeakerCost() {
		return tailorSpeakerCost;
	}
	
}
