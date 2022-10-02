package com.xworkz.runner;

import com.xworkz.inheritance.example.parent.Plastic;
import com.xworkz.inheritance.example.child.Pipe;

public class PipeRunner {

	public static void main(String[] args) {

		Pipe pipe=new Pipe("Hubli",true,9,"Finolex",8,4500);
		pipe.torisu();
		System.out.println("**********************");

		Plastic plast=new Pipe("Hasan",true,6,"GM",8,5200);
		plast.show();
		System.out.println("**********************");
		
		Pipe converted=(Pipe)plast;
		converted.torisu();
		
	}

}
