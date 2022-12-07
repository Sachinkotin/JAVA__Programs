package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.PoliceStationDto;
import com.xworkz.abstractionInSpring.repository.PoliceStationRepo;

@Component
public class PoliceStationServiceImpl implements PoliceStationService {

	@Autowired
	@Qualifier("policeStationRepo")
	PoliceStationRepo repo;
	
	@Override
	public boolean validateAndSave(PoliceStationDto dto) {
		System.out.println("Inside save method of PoliceStationServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
