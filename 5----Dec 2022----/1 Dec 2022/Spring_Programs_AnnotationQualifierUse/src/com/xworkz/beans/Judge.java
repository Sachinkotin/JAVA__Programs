package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Judge {

	
	private String name;

	private int age;

	private boolean isMarried;

	@Autowired
	private int judgeBirthYear;
	@Autowired
	private String judgeResidencePlace;
	
	public Judge( @Qualifier("judgeName") String name, @Qualifier("judgeAge") int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setMarried( @Value("true") boolean isMarried) {
		this.isMarried = isMarried;
	}

	@Override
	public String toString() {
		return "Judge [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", judgeBirthYear="
				+ judgeBirthYear + ", judgeResidencePlace=" + judgeResidencePlace + "]";
	}
	
	
	
	
	
	
	
}
