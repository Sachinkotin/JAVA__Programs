package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Court {

	
	private String name;
	@Value("15")
	private int staffStrength;
	private String location;
	@Autowired
	private Judge judge1;
	
	public Court( @Value("High Court") String name) {
		
		this.name = name;
	}

	
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Court [name=" + name + ", staffStrength=" + staffStrength + ", location=" + location + ", judge="
				+ judge1 + "]";
	}
	
	
	
	
	
	
	
	
}
