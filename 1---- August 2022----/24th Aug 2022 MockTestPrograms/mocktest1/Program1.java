package com.xworkz.mocktest1;

public class Program1 {

	public static void main(String[] args) {

		//reverse a string
		String name= "KICCHA";
		
		String revName="";
		int a=name.length();
		
		for (int i=(a-1);i>=0;i--)
		{
			revName=revName+name.charAt(i);
		}
		
		System.out.println("Name after reversing is : "+ revName);
		
		
		
	}

}
