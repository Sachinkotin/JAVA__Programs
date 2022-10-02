package com.xworkz.showcase;

public class IntegerStatic {

	public static void main(String[] args) {

		// Static methods can be accessed directly using className
		
	int a=Integer.bitCount(87);
	
	System.out.println(a);
	
	int b=Integer.compare(25, 25);
	System.out.println(b);
		
	int c=Integer.decode("52");
	System.out.println(c);
	
	int d=Integer.highestOneBit(689);
	System.out.println(d);
	
	int e=Integer.max(25, 56);
	System.out.println(e);
	
	int f=Integer.min(65, 89);
	System.out.println(f);
	
	int g=Integer.parseInt("125");
	System.out.println(g);
	
	
	}

}
