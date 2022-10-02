package com.xworkz.interfaces;

public class CustomerPubRule implements PubRule{

	@Override
	public boolean dressCodeFollowed() {
		return true;
	}
	
	@Override
	public int age() {

		return 25;
	}
	
	@Override
	public boolean validProof() {

		return true;
	}
}
