package com.xworkz.jdbcStart.repository;

import com.xworkz.jdbcStart.dto.HospitalDTO;

public class HospitalRepositoryImplementor implements HospitalRepository {

	@Override
	public boolean save(HospitalDTO hdto) {
		
		System.out.println("Data saved successfully"+hdto);
		return true;
	}

}
