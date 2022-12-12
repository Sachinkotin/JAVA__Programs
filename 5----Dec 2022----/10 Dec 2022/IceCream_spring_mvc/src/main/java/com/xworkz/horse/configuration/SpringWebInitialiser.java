package com.xworkz.horse.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Inside getRootConfigClasses method ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Inside getServletConfigClasses method ");
		return new Class[] {SpringBeanConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Inside getServletMappings ");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

		System.out.println("Inside configureDefaultServletHandling ");
		
		configurer.enable();
		
	}
	

}
