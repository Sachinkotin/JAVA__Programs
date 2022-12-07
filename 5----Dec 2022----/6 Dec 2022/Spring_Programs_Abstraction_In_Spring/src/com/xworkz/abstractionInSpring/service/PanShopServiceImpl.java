package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.PanShopDto;
import com.xworkz.abstractionInSpring.repository.PanshopRepo;

@Component
public class PanShopServiceImpl implements PanShopService {
	
	@Autowired
	@Qualifier("panshopRepo")
	PanshopRepo repo;
	
	@Override
	public boolean validateAndSave(PanShopDto dto) {
		System.out.println("Inside save method of PanShopServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
