package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PanShop {

	
	
	@Autowired
	private int panShopRent;
	@Autowired
	private String panShopOwner;
	@Autowired
	private PanShopMusicPlayer pmp;

	public PanShop() {
		System.out.println("Inside PanShop default constructor");
	}

	public int getPanShopRent() {
		return panShopRent;
	}

	public String getPanShopOwner() {
		return panShopOwner;
	}

	public void showMusicPlayerDetails() {
		System.out.println("Music Player name is : " +pmp.getMusicPlayerBrand() +"\n"+ "Music Player Cost is :  " + pmp.getMusicPlayerCost());
	}

}
