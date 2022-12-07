package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.PanShopDto;

@Component
public class PanshopRepoImpl implements PanshopRepo {

	@Override
	public boolean save(PanShopDto dto) {
		System.out.println("Inside save in PanshopRepoImpl ");
		System.out.println(dto);
		return true;
	}

	
	
}
