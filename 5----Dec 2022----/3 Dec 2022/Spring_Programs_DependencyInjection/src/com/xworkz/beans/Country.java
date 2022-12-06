package com.xworkz.beans;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("India")
	private String name;
	@Autowired
	private President president;
	@Autowired
	private VicePresident vicePresident;
	@Autowired
	private PrimeMinister pm;
	@Value("Large")
	private String armySize;
	@Value("Republic Type")
	private String democraticType;
	@Value("Delhi")
	private String capitalCity;
	@Value("28")
	private int noOfStates;
	@Value("8")
	private int noOfUts;
	//@Autowired
	//private States[] states;
	//@Autowired
	//private UnionTerritory[] ut;
	@Autowired
	@Qualifier("statesList")
	private StatesOfIndia[] stateNames;
	@Autowired
	@Qualifier("utList")
	private UTsOfIndia[] utNames;
	
	@Autowired
	@Qualifier("nuclearPlants")
	private Collection<NuclearPowerPlants> nuclearPlantsList;

	@Override
	public String toString() {
		return "Country [name=" + name + ", president=" + president + ", vicePresident=" + vicePresident + ", pm=" + pm
				+ ", armySize=" + armySize + ", democraticType=" + democraticType + ", capitalCity=" + capitalCity
				+ ", noOfStates=" + noOfStates + ", noOfUts=" + noOfUts + ", stateNames=" + Arrays.toString(stateNames)
				+ ", utNames=" + Arrays.toString(utNames) + ", nuclearPlantsList=" + nuclearPlantsList + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

	

}
