package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Country;
import com.xworkz.beans.President;
import com.xworkz.beans.PrimeMinister;
import com.xworkz.beans.VicePresident;
import com.xworkz.configrn.SpringConfign;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring= new AnnotationConfigApplicationContext(SpringConfign.class);
		Country ct1=spring.getBean(Country.class);
		System.out.println(ct1);
		
		
		
		
		
		
		
		
		
	}

}
