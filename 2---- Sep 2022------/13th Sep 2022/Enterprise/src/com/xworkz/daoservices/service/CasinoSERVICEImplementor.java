package com.xworkz.daoservices.service;

import com.xworkz.daoservices.dao.*;
public class CasinoSERVICEImplementor implements CasinoSERVICE {

	CasinoDAO casinoDao;
	
	
	public CasinoSERVICEImplementor(CasinoDAO casinoDao)
	{
		this.casinoDao=casinoDao;
	}
	
	@Override
	public boolean checkAndValidate(String name) {

		
		if (name != null && name.length() > 3 && name.length() < 50)
		{
			if(this.casinoDao.checkName(name))
			{
				System.out.println(name+" is checked and Validated");
			return true;	
			}
			else 
			{
				System.err.println(name+" is NOT checked and Validated");
				return false;
			}
			
		}
		else
		{
			System.err.println(name+" is NOT checked and Validated");
			return false;
		}
			
	}

}
