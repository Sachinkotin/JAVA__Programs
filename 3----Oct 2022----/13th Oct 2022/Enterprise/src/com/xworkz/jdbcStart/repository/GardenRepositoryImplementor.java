package com.xworkz.jdbcStart.repository;

import com.xworkz.jdbcStart.dto.GardenDTO;

import lombok.ToString;

@ToString
public class GardenRepositoryImplementor implements GardenRepository {

	@Override
	public boolean save(GardenDTO gdto) {

		System.out.println("Garden details is saved now in Garden Repository");
		System.out.println(gdto);
		return false;
	}
	
}
