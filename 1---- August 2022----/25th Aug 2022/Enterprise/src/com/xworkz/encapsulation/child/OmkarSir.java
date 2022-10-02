package com.xworkz.encapsulation.child;

import com.xworkz.encapsulation.parent.Trainer;

public class OmkarSir extends Trainer {

	public OmkarSir() {
		System.out.println("Inside a default OmkarSir constructor");
		System.out.println();

	}

	public OmkarSir(String name, int experience, String specialization) {
		super.name = name;
		super.experience = experience;
		super.specialization = specialization;
		System.out.println("string int string omkar sir constructor executed");
		System.out.println();
	}

	@Override
	public void training() {
		System.out.println(" sir teaches java in a simple way");
	}

	@Override
	public void conductInterview() {
		System.out.println("sir conducts mock interview on every saturday");
	}

	@Override
	public void coding() {
		System.out.println("Sir checks the code everyday");
	}

	public String getName() {
		return super.name;
	}

	public int getExperience() {
		return super.experience;
	}

	public String getSpecialization() {
		return super.specialization;
	}

}
