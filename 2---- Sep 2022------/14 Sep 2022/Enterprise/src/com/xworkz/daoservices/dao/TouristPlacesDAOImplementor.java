package com.xworkz.daoservices.dao;

public class TouristPlacesDAOImplementor implements TouristPlacesDAO {

	
	private String[] db= new String[10];
	private int index =0;
	
	
	@Override
	public boolean save(String name) {
        this.db[index]=name;
        System.out.println(name+" is saved in Index of "+ this.index);
        this.index++;
		return true;
	}
	
	
	@Override
	public boolean checkName(String name) {
		for (int i=0;i<this.db.length;i++)
		{
			if (this.db[i]==name)
			{
				System.out.println(name+ " is found in DataBase");
				return true;
			}
			else
			{
				continue;
			}
		}
		System.err.println(name+ " is NOT found in DataBase");
		return false;
	
		
	}
	
	@Override
	public void printTouristPlaces() {
	
	System.out.println("Tourist places are :");	
	for (int i=0 ;i<this.db.length;i++)
	{
		System.out.print(db[i]+" ");
	}
	System.out.println();	
	}
}



















