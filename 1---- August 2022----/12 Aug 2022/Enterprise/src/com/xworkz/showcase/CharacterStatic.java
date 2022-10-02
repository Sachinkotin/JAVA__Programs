package com.xworkz.showcase;

public class CharacterStatic {

	public static void main(String[] args) {

		int a=Character.charCount(52);
		System.out.println(a);
		
		char[] b= {'s','a','c','h'};
		int c=Character.codePointAt(b, 2);
		System.out.println(c);
		
		int d=Character.codePointBefore(b, 3);
		System.out.println(d);
		
		char x='k';
		char y='j';
		
		int e=Character.compare(x, y);
		System.out.println(e);
		
		String f=Character.getName(2);
		System.out.println(f);
		
	}

}
