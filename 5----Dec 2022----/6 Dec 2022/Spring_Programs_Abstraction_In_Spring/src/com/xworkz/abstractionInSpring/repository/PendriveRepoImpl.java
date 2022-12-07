package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.PendriveDto;

@Component
public class PendriveRepoImpl implements PendriveRepo {

	@Override
	public boolean save(PendriveDto dto) {
		System.out.println("Inside save of PendriveRepoImpl");
		System.err.println(dto);
		return true;
	}

}
