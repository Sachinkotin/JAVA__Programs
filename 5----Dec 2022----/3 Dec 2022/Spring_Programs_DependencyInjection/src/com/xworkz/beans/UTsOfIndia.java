package com.xworkz.beans;

import org.springframework.stereotype.Component;

@Component
public class UTsOfIndia {

	private String name;
	private double area;
	private String governorName;
	private double populationInMillion;
	
	public UTsOfIndia() {
	}

	public UTsOfIndia(String name, double area, String governorName, double populationInMillion) {
		super();
		this.name = name;
		this.area = area;
		this.governorName = governorName;
		this.populationInMillion = populationInMillion;
	}

	@Override
	public String toString() {
		return "UTsOfIndia [name=" + name + ", area=" + area + ", governorName=" + governorName
				+ ", populationInMillion=" + populationInMillion + "]";
	}
	
	
	
	
	
}
