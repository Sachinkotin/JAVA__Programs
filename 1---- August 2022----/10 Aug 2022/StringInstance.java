class StringInstance
{
	String place= "Ramdurg";
	String nativePlace="Pavagada";
		
	char placechar=place.charAt(0);
	int placeInt=place.codePointAt(4);
	int placeInt1=place.codePointCount(0,4);
	int np=place.compareTo("RAmdurg");
	int np1=place.compareToIgnoreCase("amdurg");
	String placeNew=nativePlace.concat(" is my Native place");
	boolean containsSeq=place.contains("ramd");
	boolean contentEqu=place.contentEquals("Ramdurg");
	boolean endsWith=nativePlace.endsWith("da");
	int hashCodePlace=place.hashCode();
	int indexOfPlace=place.indexOf("c");
	String internValue=nativePlace.intern();
	int lastIndex=place.lastIndexOf("r");
	int length=nativePlace.length();
	String replace=nativePlace.replace('P','J');
	
	
	public static void main(String [] args)
	{
		StringInstance si=new StringInstance();
		
		System.out.println(si.placechar);
		System.out.println(si.placeInt);
		System.out.println(si.placeInt1);
		System.out.println(si.np);
		System.out.println(si.np1);
		System.out.println(si.placeNew);
		System.out.println(si.containsSeq);
		System.out.println(si.contentEqu);
		System.out.println(si.endsWith);
		System.out.println(si.hashCodePlace);
		System.out.println(si.indexOfPlace);
		System.out.println(si.internValue);
		System.out.println(si.lastIndex);
		System.out.println(si.length);
		System.out.println(si.replace);
		
	}
	
	
}