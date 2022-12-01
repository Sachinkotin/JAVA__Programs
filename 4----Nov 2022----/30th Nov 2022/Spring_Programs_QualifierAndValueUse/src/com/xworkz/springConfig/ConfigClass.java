package com.xworkz.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.Founder;

@Configuration
@ComponentScan("com.xworkz.beans")
public class ConfigClass {
	
	@Bean
	public String founderName()
	{
		return "Omkar";
	}
	
	@Bean
	public int founderAge()
	{
		return 36;
	}
	
	@Bean
	public int founderBirthYear()
	{
		return 1990;
	}
	
	@Bean
	public String founderResidencePlace()
	{
		return "Vijayanagar Bangalore";
	}
	
	@Bean
	public Founder founder()
	{
		Founder found1= new Founder("Kiran", 25);
		
		found1.setMarried(false);
		
		return found1 ;
	}
	
	@Bean
	public Founder founder123(String founderName,int founderAge)
	{
		Founder found2= new Founder(founderName, founderAge);
		
		found2.setMarried(true);
		
		return found2 ;
	}
	
	
}
