package com.xworkz.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	public SpringWebInitialiser() {

	System.out.println("Inside a SpringWebInitialiser default constructor");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("inside getRootConfigClasses method ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("inside getServletConfigClasses method ");
		return new Class[]{SpringBeanConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("inside getServletMappings method ");
		return null;
	}
}
