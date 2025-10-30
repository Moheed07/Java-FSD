package com.polymorphism;

import java.util.Scanner;

public class Circle extends Shape {
	int radius;
	
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter radius:");
		radius = scan.nextInt();
		System.out.println();
	}
	
	@Override
	void calculateArea() {
		area = (3.147f * radius * radius);
	}
}
