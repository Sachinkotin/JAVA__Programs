package com.xworkz.abstractionInSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.ATMDto;
import com.xworkz.abstractionInSpring.repository.ATMRepo;
import com.xworkz.abstractionInSpring.repository.ATMRepoImpl;

@Component
public class ATMServiceImpl implements ATMService {

	@Autowired
	@Qualifier("atmRepo")
	ATMRepo repo;
	
	@Override
	public boolean validateAndSave(ATMDto dto) {
		System.out.println("Inside save method of ATMServiceImpl ");
		this.repo.save(dto);
		return true;
	}

}
