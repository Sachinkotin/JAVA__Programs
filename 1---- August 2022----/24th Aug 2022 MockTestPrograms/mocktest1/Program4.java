package com.xworkz.mocktest1;

public class Program4 {

	
	
	
	public static void main(String[] args) {
		String name= "Suma";
		
		String revName="";
		int a=name.length();
		
		for (int i=(a-1);i>=0;i--)
		{
			revName=revName+name.charAt(i);
		}
		
		if( name.toLowerCase().equals(revName.toLowerCase()))
				{
			System.out.println(name+" is Palindrome");
				}
		else 
		{
			System.out.println(name+" is not a Palindrome");
		}
		

	}

}
