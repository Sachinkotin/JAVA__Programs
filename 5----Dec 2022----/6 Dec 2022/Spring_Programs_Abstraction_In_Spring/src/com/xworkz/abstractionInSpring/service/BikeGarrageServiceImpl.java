package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.BikeGarrageDto;
import com.xworkz.abstractionInSpring.repository.ATMRepo;
import com.xworkz.abstractionInSpring.repository.BikeGarrageRepo;

@Component
public class BikeGarrageServiceImpl implements BikeGarrageService {

	
	@Autowired
	@Qualifier("bikeGarrageRepo")
	BikeGarrageRepo repo;
	@Override
	public boolean validateAndSave(BikeGarrageDto dto) {
		
		System.out.println("Inside save method of BikeGarrageServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
