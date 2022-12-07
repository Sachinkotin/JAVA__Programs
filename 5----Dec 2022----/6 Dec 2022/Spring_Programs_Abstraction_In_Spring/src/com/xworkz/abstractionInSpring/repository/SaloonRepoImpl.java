package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.SaloonDto;

@Component
public class SaloonRepoImpl implements SaloonRepo {

	@Override
	public boolean save(SaloonDto dto) {
		System.out.println("Inside save in RoboRepoImpl ");
		System.out.println(dto);
		return true;
		
	}

}
