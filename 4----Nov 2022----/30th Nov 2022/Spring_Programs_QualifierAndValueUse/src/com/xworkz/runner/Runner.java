package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Founder;
import com.xworkz.springConfig.ConfigClass;

public class Runner {

	public static void main(String[] args) {

		
	ApplicationContext spring=new AnnotationConfigApplicationContext(ConfigClass.class);
	Founder founr1=spring.getBean("founder123",Founder.class);
	
	Founder founr2=spring.getBean("founder",Founder.class);
	
	
	System.out.println(founr1);
	System.out.println(founr2);
	
	
	
	}

}
