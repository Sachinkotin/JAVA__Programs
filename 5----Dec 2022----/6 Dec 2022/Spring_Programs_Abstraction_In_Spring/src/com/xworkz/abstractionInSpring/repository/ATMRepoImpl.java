package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.ATMDto;

@Component
public class ATMRepoImpl implements ATMRepo {

	@Override
	public boolean save(ATMDto dto) {

		System.out.println("Inside save in ATMRepoImpl ");
		System.out.println(dto);
		return true;
	}
	

}
