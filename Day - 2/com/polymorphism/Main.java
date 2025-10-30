package com.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Geometry geo = new Geometry();
		geo.accept(new Circle());
		geo.accept(new Square());
		geo.accept(new Rectangle());
	}
}
