package com.xworkz.abstractionInSpring.beans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JacketDto {

	
	
	private String brand;
	private int price;
	

}
