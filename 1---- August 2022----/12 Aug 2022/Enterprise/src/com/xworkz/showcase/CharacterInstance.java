package com.xworkz.showcase;

public class CharacterInstance {

	public static void main(String[] args) {

		Character chara=new Character('s');
		
		char a= chara.charValue();
		System.out.println(a);
		
		int b= chara.compareTo('s');
		System.out.println(b);
		
		boolean c=chara.equals('d');
		System.out.println(c);
		
		int d=chara.hashCode();
		System.out.println(d);
		
		String e=chara.toString();
		System.out.println(e);
				
		
		
		
	}

}
