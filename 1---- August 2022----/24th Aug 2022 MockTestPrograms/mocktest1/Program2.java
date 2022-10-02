package com.xworkz.mocktest1;

public class Program2 {

	public static void main(String[] args) {

		String name="sachin";
		char gender='a';

		int see=0;
		for(int i=0;i<name.length();i++)
		{
		if(name.charAt(i)==gender)
		see++;
		}

		System.out.println("Number of character "+gender+" in name "+name+" is "+see);
		
		
		
	}

}
