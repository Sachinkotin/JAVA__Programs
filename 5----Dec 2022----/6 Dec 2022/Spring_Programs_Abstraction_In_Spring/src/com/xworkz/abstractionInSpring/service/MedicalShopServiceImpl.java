package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.MedicalShopDto;
import com.xworkz.abstractionInSpring.repository.MedicalShopRepo;
@Component
public class MedicalShopServiceImpl implements MedicalShopService {

	@Autowired
	@Qualifier("medicalShopRepo")
	MedicalShopRepo repo;
	
	@Override
	public boolean validateAndSave(MedicalShopDto dto) {
		System.out.println("Inside save method of MedicalShopServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
