package com.xworkz.object.parent;

public class Fish {

	private String name;
	private String type;

	protected Fish() {
		System.out.println("Inside a default Fish constructor");
	}

	protected Fish(String name, String type) {
		System.out.println("Inside a Str,Str Fish constructor");
		this.name = name;
		this.type = type;
	}

	protected String getName() {
		return this.name;
	}

	protected String getType() {
		return this.type;
	}

	@Override
	public String toString() {
		
		return "Breed is "+this.name+"  Type is "+this.type;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not Null");
			if (obj instanceof Fish) {
				System.out.println("Object is Type of Fish");
				Fish converted = (Fish) obj;
				String b1 = converted.name;
				String b2 = converted.type;
				if (this.name.equals(b1) && this.type.equals(b2)) {
					System.out.println("Both are same");
					return true;
				}

			} else {
				System.err.println("Object is not Type of Fish");
			}
		} else {
			System.err.println("Object is Null");
		}
		return super.equals(obj);
	}

}