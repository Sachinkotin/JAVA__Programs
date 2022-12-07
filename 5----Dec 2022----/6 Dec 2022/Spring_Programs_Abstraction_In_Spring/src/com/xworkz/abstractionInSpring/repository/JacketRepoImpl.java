package com.xworkz.abstractionInSpring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.abstractionInSpring.beans.JacketDto;

@Component
public class JacketRepoImpl implements JacketRepo {

	@Override
	public boolean save(JacketDto dto) {

		System.out.println("Inside save in JacketRepoImpl ");
		System.out.println(dto);
		return true;
	}

}
