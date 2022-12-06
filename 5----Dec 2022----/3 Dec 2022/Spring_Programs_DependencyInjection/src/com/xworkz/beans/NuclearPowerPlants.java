package com.xworkz.beans;

import org.springframework.stereotype.Component;

@Component
public class NuclearPowerPlants {

	
	private String name;
	private String stateName;
	
	public NuclearPowerPlants() {
	}
	
	public NuclearPowerPlants(String name, String stateName) {
		this.name = name;
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "NuclearPowerPlants [name=" + name + ", stateName=" + stateName + "]";
	}
	
	
	
	
	
}
