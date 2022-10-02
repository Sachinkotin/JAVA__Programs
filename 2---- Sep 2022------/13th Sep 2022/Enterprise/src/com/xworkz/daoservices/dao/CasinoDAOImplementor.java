package com.xworkz.daoservices.dao;


//import com.xworkz.daoservices.service.*;
public class CasinoDAOImplementor implements CasinoDAO {

	private String[] dataStore=new String[5];
	private int index=0;
	
	@Override
	public boolean save(String name) {
		
		this.dataStore[index] = name;
		System.out.println("data stored " + name + " index" + this.index);
		this.index++;
		return true;

	}
	
//	@Override
//	public boolean checkName(String name) {
//
//		for (String ref:this.dataStore)
//			if (ref != null && ref.equals(name)) {
//				System.out.println("it is valid");
//				return true;
//			}
//		return false;
//
//	}
	
	@Override
	public boolean checkName(String name) 
	{
		
			for(int i=0;i<dataStore.length;i++)
			{
				if (name.equals(dataStore[i]))
				{
					System.out.println("Name: "+name+"  is found in DB");
					return true;
				}
				else
				{
					continue;
				}
				
			}
			System.err.println("Name: "+name+"  is not found in DB");
			return false;
			
		}
	@Override
	public void printNames()
		{
			for(int i=0;i<dataStore.length;i++)
			{
				System.out.println(dataStore[i]);
			}
		}
	}

				
								
			
		
	
	

