package com.xworkz.showcase;

public class BooleanInstance {

	public static void main(String[] args) {
		
		Boolean booj=new Boolean (true);
		
		Boolean boj1=new Boolean ("false");
		
		boolean a=booj.booleanValue();
		System.out.println(a);
		
		boolean b=true;
		int c=booj.compareTo(b);
		System.out.println(c);
		
		boolean d=booj.equals(boj1);
		System.out.println(d);
		
		int e=boj1.hashCode();
		System.out.println(e);
		
		String f=booj.toString();
		System.out.println(f);

		
		
	}

}
