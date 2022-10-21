package com.xworkz.jdbcStart.runner;

import com.xworkz.jdbcStart.dto.GardenDTO;
import com.xworkz.jdbcStart.service.GardenServiceImplementor;

public class GardenRunner {

	public static void main(String[] args) {

		GardenDTO gdto=new GardenDTO("Ramayya","BTM Layout",10,30,1947);
		
		GardenServiceImplementor gsi= new GardenServiceImplementor();
		gsi.checkAndValidate(gdto);
		
		System.out.println("****************************************");
		
		
	
		
	}

}
