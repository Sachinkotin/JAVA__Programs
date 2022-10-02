package com.xworkz.showcase;

public class BooleanStatic {

	static boolean x=true;
	static boolean y=false;
	
	public static void main(String[] args) {

	
		
	int a=Boolean.compare(x, y);
	System.out.println(a);
	
	int b=Boolean.hashCode(x);
	System.out.println(b);
	
	boolean c=Boolean.logicalAnd(y, x);
	System.out.println(c);
	
	boolean e=Boolean.logicalOr(x, y);
	System.out.println(e);
	
	boolean d=Boolean.parseBoolean("true");
	System.out.println(d);
	
	
	
		
		
	}

}
