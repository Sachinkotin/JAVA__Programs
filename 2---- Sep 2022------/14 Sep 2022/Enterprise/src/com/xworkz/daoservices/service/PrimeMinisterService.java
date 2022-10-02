package com.xworkz.daoservices.service;

import com.xworkz.daoservices.exceptions.*;
public interface PrimeMinisterService {

	
	public boolean validAndSave(String name) throws PrimeMinisterCheckedException; 
}
