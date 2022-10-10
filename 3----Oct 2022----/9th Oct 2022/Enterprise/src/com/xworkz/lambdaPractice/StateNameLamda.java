package com.xworkz.lambdaPractice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StateNameLamda {

	public static void main(String[] args) {

		
		 List<String> list = new ArrayList<String>();
		
		list.add("Goa");
		list.add("Kerala");
		list.add("Punjab");
		list.add("Delhi");
		list.add("Goa");
		list.add("Assam");
		list.add("Haryana");
		
		System.out.println("All State Names Are: ");
		list.forEach((check)->System.out.println("State Name is: "+check));
		System.out.println();
		
		System.out.println("State Names ending with a : ");
		list.stream().filter((ref)->ref.endsWith("a")).forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("Unique State names are: ");
		list.stream().distinct().forEach((k)->System.out.println(k));
		System.out.println();
		
		long m=list.stream().count();
		System.out.println("Total No Of State Names in List are : "+m);
		System.out.println();
		
		System.out.println("State Names starting with K :");
		list.stream().filter((ref)->ref.startsWith("K")).forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("State Names containing L :");
		list.stream().filter((ref)->ref.contains("L")).forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("State Names containing D :");
		list.stream().filter((ref)->ref.contains("D")).forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("State Names containing R :");
		list.stream().filter((ref)->ref.contains("R")).forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("State Names containing h :");
		list.stream().filter((ref)->ref.contains("h")).forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("State Names with more than 10 characters :");
		list.stream().filter((ket)->ket.length()>10).forEach((ket)->System.out.println(ket));
		System.out.println();
		
		System.out.println("State Names with less than 5 characters :");
		list.stream().filter((ref)->ref.length()<5).forEach((ref)->System.out.println(ref));
		System.out.println();
		
		System.out.println("All States in Upper case :");
		list.stream().filter((ref)->{ref.toUpperCase();return true;}).forEach((ref)->System.out.println(ref.toUpperCase()));
		System.out.println();
		
		System.out.println("All States in Lower case :");
		list.stream().filter((ref)->{ref.toLowerCase();return true;}).forEach((ref)->System.out.println(ref.toLowerCase()));
		System.out.println();
		
		System.out.println("Duplicate Characters in each state ");
		list.stream().filter((ref)->{
			if(1==1) {
			System.out.println("Duplicate Characters in state "+ref+" are");
			char[] mg=ref.toCharArray();
			System.out.println("----");
		for (int i = 0; i < mg.length; i++) {
			for (int j = i+1; j < mg.length; j++) {
				{
					if(mg[i]==mg[j])
					{	
				    System.out.println(mg[i]);
				    
				    
					}}
			}}
		System.out.print(" ");
		};return true;}).forEach((ref)->{System.out.println("*********************** ");});
		
		System.out.println();
		//List<Character> list2= new ArrayList<Character>();
		// list2.add(mg[i]);
		//list2.stream().distinct().forEach((k)->System.out.println(k));
		
		System.out.println("Remove all duplicate characters in each state");
		System.out.println();
		
		System.out.println("All States in Reverse order:");
		System.out.println();
		
		System.out.println("Palindrome States are :");
		System.out.println();
		
		
	}

}





















