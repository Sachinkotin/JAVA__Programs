package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.parent.Try1;
import com.xworkz.encapsulation.child.Try2;

public class Try3 {

	public static void main(String[] args) {

		Try1 m1=new Try1();
		m1.torisu();
		System.out.println("*******************************************************");
		
//		Try1 k2=new Try1("Sachin",591123);
//		k2.torisu();
//		System.out.println("*******************************************************");
//		
		Try1 m5=new Try2();
		m5.add();
		m5.torisu();
		System.out.println(m5.toString());
		System.out.println("*******************************************************");
//		
//		Try2 m2=new Try2("Kiran",654789,"Ramdurg","BTM");
//		m2.torisu();
//		System.out.println("*******************************************************");
//		
		
//		if (m2 instanceof Try2)
//		{
//			System.out.println("Hi");
//		}
//		else if (m2 instanceof Try1)
//		{
//			System.out.println("No Hi");
//		}
//		else
//		{
//			System.out.println("******");
//		}
//		
		
	}

}
