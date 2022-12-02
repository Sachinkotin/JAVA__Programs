package com.xworkz.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Court;
import com.xworkz.beans.Founder;
import com.xworkz.beans.Institute;
import com.xworkz.beans.Judge;
import com.xworkz.springConfig.ConfigClass;

public class Runner {

	public static void main(String[] args) {

		
	ApplicationContext spring=new AnnotationConfigApplicationContext(ConfigClass.class);
	System.err.println("No Of Beans generated : "+spring.getBeanDefinitionCount());
	String [] df=spring.getBeanDefinitionNames();
	for(String i:df)
		System.out.println(i);
	
	Institute nhl=spring.getBean(Institute.class);
	nhl.setLocation("BTM layout");
	System.out.println(nhl);
	
	Founder founr1=spring.getBean("founder123",Founder.class);
	Founder founr2=spring.getBean("founder",Founder.class);
	System.out.println(founr1);
	System.out.println(founr2);
	
	Court ctm=spring.getBean(Court.class);
	ctm.setLocation("Dharwad");
	System.out.println(ctm);
	
	Judge ct1=spring.getBean("judge1", Judge.class);
	Judge ct2=spring.getBean("judge2", Judge.class);
	System.out.println(ct1);
	System.out.println(ct2);
	
	
	
	
	
	
	
	}

}
