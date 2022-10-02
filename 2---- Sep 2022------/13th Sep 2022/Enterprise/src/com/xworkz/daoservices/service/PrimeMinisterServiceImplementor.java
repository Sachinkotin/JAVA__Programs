package com.xworkz.daoservices.service;

import com.xworkz.daoservices.exceptions.*;
import com.xworkz.daoservices.dao.*;
public class PrimeMinisterServiceImplementor implements PrimeMinisterService {

	private PrimeMinisterDAO pmdao;
	
	public PrimeMinisterServiceImplementor(PrimeMinisterDAO pmdao){
		super();
		this.pmdao=pmdao;
	}
	
	
	@Override
	public boolean validAndSave(String name) throws PrimeMinisterCheckedException {

		if (name!=null && name.length()<50 && name.length()>4)
		{
			if(pmdao.duplicate(name))
			{
				System.err.println("Nmber is already present");
				throw new PrimeMinisterCheckedException(" Name is duplicate");
			}
			else 
			{
				System.out.println(" U can save name: "+ name);
				pmdao.save(name);
			}
		}
		return false;
	}
	
	
}
