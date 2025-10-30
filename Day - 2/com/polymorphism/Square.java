package com.polymorphism;

import java.util.Scanner;

public class Square extends Shape {
	int length;
	
	@Override
	void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Length: ");
		length = scan.nextInt();
		System.out.println();
	}
	
	@Override
	void calculateArea() {
		area = length * length;
	}
}
