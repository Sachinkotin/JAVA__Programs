package com.xworkz.dao;

public class LakeDAOImplementor implements LakeDAO {

	private String [] lakeNames = new String [5];
	private int index=0;
	
	
	@Override
	public boolean save(String lakeName) {
		this.lakeNames[index]=lakeName;
		System.out.println("Lake is Saved as: "+lakeName+" into index of "+this.index);
		this.index ++;
		return true;
	}
	
	@Override
	public void printAllLakes() {

		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}
	}
}
