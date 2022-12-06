package com.xworkz.beans;

import org.springframework.stereotype.Component;

@Component

public class StatesOfIndia {

	
	private String name;
	private String population;
	private String capitalCity;
	private int noOfDistricts;
	private String area;
	private String cmName;
	private String primaryLanguage;
	
	public StatesOfIndia() {
	}

	public StatesOfIndia(String name, String population, String capitalCity, int noOfDistricts, String area,
			String cmName, String primaryLanguage) {
		super();
		this.name = name;
		this.population = population;
		this.capitalCity = capitalCity;
		this.noOfDistricts = noOfDistricts;
		this.area = area;
		this.cmName = cmName;
		this.primaryLanguage = primaryLanguage;
	}

	@Override
	public String toString() {
		return "StatesOfIndia [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage="
				+ primaryLanguage + "]";
	}
	
	
	
	
}
