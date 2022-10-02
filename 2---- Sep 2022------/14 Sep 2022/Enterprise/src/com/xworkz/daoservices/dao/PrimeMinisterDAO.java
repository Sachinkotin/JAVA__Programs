package com.xworkz.daoservices.dao;

import com.xworkz.daoservices.exceptions.*;
public interface PrimeMinisterDAO {

	public boolean save(String name) throws PrimeMinisterCheckedException;
	
	public boolean duplicate(String name);
	
	
}
