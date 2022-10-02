package com.xworkz.dto.runner;

import com.xworkz.dto.PGBoysDTO;
public class PGBoysDTORunner {

	public static void main(String[] args) {

		PGBoysDTO pgbd=new PGBoysDTO();
		pgbd.setOwnerName("Ram");
		pgbd.setOwnerPhoneNumber(7975591235L);
		pgbd.setOwnerPlace("Tumkur");
		pgbd.setNameOfCook("Shyam");
		pgbd.setPlaceOfCook("Tsangpo");
		pgbd.setAgeOfCook(25);
		System.out.println(pgbd.hashCode());
		
		PGBoysDTO pgbd12=new PGBoysDTO();
		pgbd12.setOwnerName("Rama");
		pgbd12.setOwnerPhoneNumber(7975591235L);
		pgbd12.setOwnerPlace("Tumkur");
		pgbd12.setNameOfCook("Shyam");
		pgbd12.setPlaceOfCook("Tsangpo");
		pgbd12.setAgeOfCook(25);
		System.out.println(pgbd12.hashCode());
		
		pgbd.equals(pgbd12);
		
	}

}
