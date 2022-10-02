package com.xworkz.daoservices.dao;

public interface TouristPlacesDAO {

	public boolean save(String name);
	public boolean checkName(String name);
	public void printTouristPlaces();
}
