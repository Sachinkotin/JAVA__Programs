package com.xworkz.lambdaPractice.DTO;

import java.io.Serializable;
import com.xworkz.lambdaPractice.enums.*;

public class HouseDTO implements Serializable {

	private int id;
	private String name;
	private String owner;
	private Type type;
	private int noOfFloors;
	private boolean loan;
	private OwningType ot;
	private double sqFeet;

//	DTO (Note):
//	1. All variables have to be private.
//	2.DTO class will not have any methods in it.
//	3.Use setters and getters to initialise and to get value.
//	4.Default constructor and parameterised Constructor must be present.
//	5.DTO class must be serializable(to be thought in Interfaces).
// 	6.override toString method too

	public HouseDTO() {
		super();
		System.out.println("Inside Default HouseDTO construtor");
	}

	public HouseDTO(int id, String name, String owner, Type type, int noOfFloors, boolean loan, OwningType ot,
			double sqFeet) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.noOfFloors = noOfFloors;
		this.loan = loan;
		this.ot = ot;
		this.sqFeet = sqFeet;
		//System.out.println("Inside Parameterised HouseDTO construtor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isLoan() {
		return loan;
	}

	public void setLoan(boolean loan) {
		this.loan = loan;
	}

	public OwningType getOt() {
		return ot;
	}

	public void setOt(OwningType ot) {
		this.ot = ot;
	}

	public double getSqFeet() {
		return sqFeet;
	}

	public void setSqFeet(double sqFeet) {
		this.sqFeet = sqFeet;
	}

	@Override
	public String toString() {
		return "HouseDTO [id=" + id + ", name=" + name + ", owner=" + owner + ", type=" + type + ", noOfFloors="
				+ noOfFloors + ", loan=" + loan + ", ot=" + ot + ", sqFeet=" + sqFeet + "]";
	}
	
	

}
