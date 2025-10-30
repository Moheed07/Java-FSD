package com.Inheritance;

public class BiologyTeacher extends Teacher {
//	String name;

	public void teach() {
		System.out.println(name+" is teaching the Biology Class.");
	}
	public void doDisectionExp() {
		System.out.println(name+" is doing the Disection Experiment.");
	}
}
