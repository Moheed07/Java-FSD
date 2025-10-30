package com.Inheritance;

public class PhysicsTeacher extends Teacher {
//	String name;
	public void teach() {
		System.out.println(name+" is teaching the Physics Class.");
	}
	public void doLawsExp() {
		System.out.println(name+" is doing the Laws of Motion Experiment.");
	}
}
