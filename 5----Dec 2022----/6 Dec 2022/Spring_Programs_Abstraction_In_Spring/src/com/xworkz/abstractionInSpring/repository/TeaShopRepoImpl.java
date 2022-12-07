package com.xworkz.abstractionInSpring.repository;

import com.xworkz.abstractionInSpring.beans.TeaShopDto;

public class TeaShopRepoImpl implements TeaShopRepo {

	@Override
	public boolean save(TeaShopDto dto) {
		System.out.println("Running save in SimRepoImpl class");
		System.out.println(dto);
		return true;
	}

}
