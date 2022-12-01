package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Institute {

	private String name;
	@Value("9")
	private int staffStrength;
	private String location;
	@Autowired
	private Founder founder;
	
	public Institute( @Value("X-workz") String name)
	{
		this.name=name;
	}
	
	public void setLocation( @Value("BTM Layout") String location) 
	{
		this.location = location;
	}

	@Override
	public String toString() {
		return "Institute [name=" + name + ", staffStrength=" + staffStrength + ", location=" + location + ", founder="
				+ founder + "]";
	}

	
	
	
	
}
