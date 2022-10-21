package com.xworkz.jdbcStart.service;

import com.xworkz.jdbcStart.dto.GardenDTO;
import com.xworkz.jdbcStart.repository.GardenRepositoryImplementor;

public class GardenServiceImplementor implements GardenService {

	@Override
	public boolean checkAndValidate(GardenDTO gdto) {

		String name = gdto.getName();
		String place = gdto.getPlace();
		int noOfGates = gdto.getNoOfGates();
		int entryFee = gdto.getEntryFee();
		int since = gdto.getSince();

		if (name != null && name.length() > 6 && name.length() < 60) {
			System.out.println("Name is Valid");
			if (place != null && place.length() > 5 && place.length() < 50) {
				System.out.println("Place is Valid");
				if (noOfGates > 2 && noOfGates < 20) {
					System.out.println("No Of Gates is Valid");
					if (entryFee > 10 && entryFee < 50) {
						System.out.println("Entry Fee is Valid");
						if (since > 1900 && since < 2022) {
							System.out.println("Established Year is Valid");
							GardenRepositoryImplementor gri = new GardenRepositoryImplementor();
							gri.save(gdto);

						} else {
							System.err.println("Established Year is not Valid");
						}
					} else {
						System.err.println("Entry Fee is Not Valid");
					}
				} else {
					System.err.println("No Of Gates is Not Valid");
				}
			} else {
				System.err.println("Place is not Valid");
			}
		} else {
			System.err.println("Name is not Valid");
		}
		return false;
	}

}
