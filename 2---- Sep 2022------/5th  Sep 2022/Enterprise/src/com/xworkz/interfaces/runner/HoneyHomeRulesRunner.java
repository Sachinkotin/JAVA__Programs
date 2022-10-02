package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.HoneyHomeRules;

public class HoneyHomeRulesRunner {

	public static void main(String[] args) {

		HoneyHomeRules hmr1= new HoneyHomeRules();
		System.out.println(hmr1.wakeUpTime());
		System.out.println(hmr1.maxEntryTime());
		hmr1.noDrinkAllowed();
		
	}

}
