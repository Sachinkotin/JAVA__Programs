package com.xworkz.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.Hotel;
import com.xworkz.beans.Park;
import com.xworkz.beans.SweetBun;

@Configuration
@ComponentScan("com.xworkz.beans")
public class SpringConfig {

	@Bean
	public SweetBun sweetbun() {
		SweetBun sweetBun = new SweetBun();
		sweetBun.show();
		return sweetBun;
	}

	@Bean
	public Park park()
	{
		Park value=new Park();
		return value;
	}
	
	@Bean
	public Hotel hotel()
	{
		Hotel hotel1=new Hotel();
		return hotel1;
	}
	
	@Bean
	public String cycle() {
		String value = "Cycling is good for health";
		return value;
	}
	
	@Bean
	public String horse()
	{
		return "Horse name is Chetak ";
	}
	

}
