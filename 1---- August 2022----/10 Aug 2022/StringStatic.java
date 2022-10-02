class StringStatic
{
	static char[] data={'S','A','C','H','I','N'};
	static String name;
	static String detail;
	static boolean b=true;
	static String check;
	static String find;
	static String name1;
	

	
	
	
	
	
	public static void main(String [] args)
	{
		System.out.println(StringStatic.name.copyValueOf(data));
		System.out.println(StringStatic.detail.copyValueOf(data,1,2));
		System.out.println(StringStatic.check.valueOf(b));
		System.out.println(StringStatic.find.valueOf('c'));
		System.out.println(StringStatic.name1.valueOf(data));
		
		
		
		
		
	}
}