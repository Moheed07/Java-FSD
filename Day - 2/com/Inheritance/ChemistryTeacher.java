package com.Inheritance;

public class ChemistryTeacher extends Teacher {
//	String name;
	
	public void teach() {
		System.out.println(name+" is teaching the Chemistry Class.");
	}
	public void doChemicalExp() {
		System.out.println(name+" is doing the Chemistry Experiment.");
	}
}
