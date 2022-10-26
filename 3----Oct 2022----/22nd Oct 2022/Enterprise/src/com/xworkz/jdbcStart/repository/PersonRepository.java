package com.xworkz.jdbcStart.repository;

import com.xworkz.jdbcStart.dto.PersonDTO;

public interface PersonRepository {

	
		
		boolean save(PersonDTO dto);
		
		void displayAll();
		
		void displayAllAgeGreaterThenOrderByName(int age);
		
		void displayAllByGenderDescOrderByName(String gdr);
		
		void displayAllBySalaryGreaterThanOrderByDesc(double slry);
		
	    void displayCount();
		
		void displaySumOfSalary();

	
	
	
}
