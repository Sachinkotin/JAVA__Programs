package com.xworkz.jdbcStart.service;

import com.xworkz.jdbcStart.dto.PersonDTO;

public interface PersonService {


		boolean validAndSave(PersonDTO dto);
		
		void displayAll();
		
		void displayAllAgeGreaterThenOrderByName(int age);
		
		void displayAllByGenderDescOrderByName(String gdr);
		
		void displayAllBySalaryGreaterThanOrderByDesc(double slry);
		
		void displayCount();
		
		void displaySumOfSalary();
	
	
}
