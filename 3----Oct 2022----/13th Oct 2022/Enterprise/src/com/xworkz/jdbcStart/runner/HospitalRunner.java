package com.xworkz.jdbcStart.runner;

import com.xworkz.jdbcStart.dto.HospitalDTO;
import com.xworkz.jdbcStart.service.HospitalServiceImplementor;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO hdto = new HospitalDTO(1, "Kulgod", "Orthopedic", 12.00);

		HospitalServiceImplementor hsi = new HospitalServiceImplementor();
		hsi.validateAndSave(hdto);

	}

}
