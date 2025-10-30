package com.polymorphism;

public class Shape {
	float area;
	void acceptInput() {
		System.out.print("Accepting input");
		System.out.println();
	}
	void calculateArea() {
		System.out.print("Calculating area...");
		System.out.println();
	}
	void displayArea() {
		System.out.print("Area is : " + area);
	}
}