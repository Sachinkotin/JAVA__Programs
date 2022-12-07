package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.BikeGarrageDto;

@Component
public class BikeGarrageRepoImpl implements BikeGarrageRepo {

	@Override
	public boolean save(BikeGarrageDto dto) {
		System.out.println("Inside save in BikeGarrageRepoImpl ");
		System.out.println(dto);
		
		return true;
		
	}

	
	
	

}
