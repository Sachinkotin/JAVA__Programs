package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.PoliceStationDto;

@Component
public class PoliceStationRepoImpl implements PoliceStationRepo {

	@Override
	public boolean save(PoliceStationDto dto) {
		System.out.println("Inside save in PoliceStationRepoImpl ");
		System.out.println(dto);
		return true;
	}

}
