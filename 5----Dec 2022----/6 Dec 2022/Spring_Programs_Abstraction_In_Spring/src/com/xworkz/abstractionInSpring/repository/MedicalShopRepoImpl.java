package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.MedicalShopDto;

@Component
public class MedicalShopRepoImpl implements MedicalShopRepo {

	@Override
	public boolean save(MedicalShopDto dto) {
		System.out.println("Inside save in MedicalShopRepoImpl ");
		System.out.println(dto);
		return true;
	}

}
