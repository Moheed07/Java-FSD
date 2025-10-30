package com.polymorphism;

import java.util.Scanner;

public class Rectangle extends Shape {
	int length;
	int breadth;
	
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		length = scan.nextInt();
		System.out.println();
		System.out.print("Enter the Breadth: ");
		breadth = scan.nextInt();
		System.out.println();
	}
	
	@Override
	void calculateArea() {
		area = length * breadth;
	}
}
