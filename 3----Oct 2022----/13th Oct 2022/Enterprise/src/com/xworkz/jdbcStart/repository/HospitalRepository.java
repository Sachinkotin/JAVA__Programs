package com.xworkz.jdbcStart.repository;

import com.xworkz.jdbcStart.dto.HospitalDTO;

public interface HospitalRepository {

	boolean save(HospitalDTO hdto);
	
}
