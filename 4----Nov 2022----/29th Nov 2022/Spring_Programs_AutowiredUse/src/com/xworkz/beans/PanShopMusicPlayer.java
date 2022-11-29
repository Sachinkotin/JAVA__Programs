package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PanShopMusicPlayer {

	@Autowired
	private String musicPlayerBrand;
	@Autowired
	private int musicPlayerCost;
	

	public PanShopMusicPlayer() {
		System.out.println("Inside PanShopMusicPlayer default constructor");
	}

	public String getMusicPlayerBrand() {
		return musicPlayerBrand;
	}

	public int getMusicPlayerCost() {
		return musicPlayerCost;
	}

	

	
	
}
