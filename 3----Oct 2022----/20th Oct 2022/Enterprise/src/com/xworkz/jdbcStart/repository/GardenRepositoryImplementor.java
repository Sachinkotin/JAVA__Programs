package com.xworkz.jdbcStart.repository;

import com.xworkz.jdbcStart.dto.GardenDTO;

import lombok.ToString;

@ToString
public class GardenRepositoryImplementor implements GardenRepository {

	
	@Override
	public boolean save(GardenDTO gdto) {

		System.out.println("Garden details is saved now in Garden Repository");
		System.out.println(gdto);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("data saved");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return false;
	}
	
}
