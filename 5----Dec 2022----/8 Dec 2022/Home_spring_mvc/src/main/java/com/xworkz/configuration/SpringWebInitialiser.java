package com.xworkz.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	public SpringWebInitialiser() {
		System.out.println("Inside a default SpringWebInitialiser constructor ");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Inside a getRootConfigClasses method ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Inside a getServletConfigClasses method ");
		return new Class[] {SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Inside a getServletMappings method ");
		return null;
	}
	
	
	
	
	
	
	
}
