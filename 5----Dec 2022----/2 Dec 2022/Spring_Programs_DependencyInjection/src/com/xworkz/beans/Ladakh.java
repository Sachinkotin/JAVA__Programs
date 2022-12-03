package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ladakh {

	@Value("Ladakh")
	private String name;
	@Value("10.3")
	private double area;
	@Value("M Y Dattatreya")
	private String governorName;
	@Value("8.4")
	private double populationInMillion;
	
	
	@Override
	public String toString() {
		return "Ladakh [name=" + name + ", area=" + area + ", governorName=" + governorName + ", populationInMillion="
				+ populationInMillion + "]";
	}
	
	
	
}
