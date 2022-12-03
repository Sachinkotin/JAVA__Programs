package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Maharashtra {

	
	@Value("Maharashtra")
	private String name;
	
	@Value("5.5 crore")
	private String population;
	
	@Value("Mumbai")
	private String capitalCity;
	
	@Value("29")
	private int noOfDistricts;
	
	@Value("1,81,500 sq.Km")
	private String area;
	
	@Value("Raghuram Thakur")
	private String cmName;
	
	@Value("Marati")
	private String primaryLanguage;
	
	

	@Override
	public String toString() {
		return "Maharashtra [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage="
				+ primaryLanguage + "]";
	}
	
	
	
	
	
	
	
}
