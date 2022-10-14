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

public class HospitalDTO {

	private int id;
	private String name;
	private String specialist;
	private double openTime;
	
	
	
}
