package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Founder {

	private String name;
	
	private int age;
	
	private boolean isMarried;
	
	@Autowired
	private int founderBirthYear;
	@Autowired
	private String founderResidencePlace;
	

	public Founder( @Qualifier("founderName") String name, @Qualifier("founderAge") int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setMarried( @Value("true") boolean isMarried) 
	{
		this.isMarried = isMarried;
	}

	@Override
	public String toString() {
		return "Founder [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", founderBirthYear="
				+ founderBirthYear + ", founderResidencePlace=" + founderResidencePlace + "]";
	}

	



	
	
	
	
}
