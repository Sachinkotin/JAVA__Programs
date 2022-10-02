package com.xworkz.dto.runner;

import com.xworkz.dto.TableDTO;

public class TableDTORunner {

	public static void main(String[] args) {

		TableDTO table1=new TableDTO();
		System.out.println(table1.hashCode());
		table1.setName("Sona");
		table1.setColor("Black");
		table1.setIsItBlackInColor(false);
		table1.setDoYouGive5rating(true);
		
		
		
		TableDTO table2=new TableDTO();
		System.out.println(table2.hashCode());
		table2.setName("Sona");
		table2.setColor("Black");
		table2.setIsItBlackInColor(true);
		table2.setDoYouGive5rating(true);
		
		table1.equals(table2);
		
		
	}

}
