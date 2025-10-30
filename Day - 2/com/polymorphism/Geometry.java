package com.polymorphism;

public class Geometry {
	void accept(Shape shape) {
		shape.acceptInput();
		shape.calculateArea();
		shape.displayArea();
	}
}
