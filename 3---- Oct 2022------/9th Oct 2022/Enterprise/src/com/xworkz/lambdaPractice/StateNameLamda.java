package com.xworkz.lambdaPractice;


import java.util.ArrayList;
import java.util.List;

public class StateNameLamda {

	public static void main(String[] args) {

		
		 List<String> list = new ArrayList<String>();
		
		list.add("Karnataka");
		list.add("Goa");
		list.add("Maharashtra");
		list.add("Kerala");
		list.add("Punjab");
		list.add("Delhi");
		
		System.out.println("All State Names Are: ");
		list.forEach((check)->System.out.println("State Name is: "+check));
		
		System.out.println();
		System.out.println("State Names ending with a : ");
		list.stream().filter((ref)->ref.endsWith("a")).forEach((ref)->System.out.println(ref));
	}

}
