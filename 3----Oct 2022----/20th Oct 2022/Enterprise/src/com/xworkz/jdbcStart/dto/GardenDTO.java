package com.xworkz.jdbcStart.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class GardenDTO {

	private String name;
	private String place;
	private int noOfGates;
	private int entryFee;
	private int since;
	
	
	
	
}
