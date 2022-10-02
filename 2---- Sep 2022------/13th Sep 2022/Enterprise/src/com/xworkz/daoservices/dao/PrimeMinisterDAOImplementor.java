package com.xworkz.daoservices.dao;

import com.xworkz.daoservices.exceptions.*;
public class PrimeMinisterDAOImplementor implements PrimeMinisterDAO{

	private String[] name=new String[5];
	private int index;
	
	@Override
	public boolean save(String name)  {

		if (name.length()<this.index)
		{
			throw new PrimeMinisterArrayIndexException(" In the array there is no Space");
		}
		this.name[index]=name;
		System.out.println(" Name is stored in string array"+ name);
		return false;
	}
	
	@Override
	public boolean duplicate(String name) {

		for (String string: this.name)
		{
			if(name.equals(name))
			{
				System.out.println(name+" is Duplicate ");
			}
			else
			{
				System.out.println(name+" is NOT  Duplicate ");
			}
		}
		return false;
	}
}


















