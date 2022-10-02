package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.*;
public class PubRuleRunner {

	public static void main(String[] args) {
		PubRule pub = new CustomerPubRule();
		
		DownTownPub down= new DownTownPub(pub);
		down.checkRule();
		
	}

}
