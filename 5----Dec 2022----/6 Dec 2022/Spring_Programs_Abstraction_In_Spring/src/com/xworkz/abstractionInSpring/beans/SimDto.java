package com.xworkz.abstractionInSpring.beans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class SimDto {

	private int id;
	private String operator;
	private String type;
	private long imei;
	
}
