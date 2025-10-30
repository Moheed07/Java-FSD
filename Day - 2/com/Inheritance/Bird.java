package com.Inheritance;

public class Bird {
	String name;
	void eat() {
		System.out.println(name+ " is Eating");
	}
	public static void main(String[] args) {
		System.out.println("======================================");

		Eagle eagle = new Eagle();
		eagle.name = "Garuda";
		eagle.habitat = "Open Jungle";
		eagle.eat();
		eagle.hunt();

		System.out.println("======================================");

		Sparrow sparrow = new Sparrow();
		sparrow.name = "Chudi";
		sparrow.habitat = "Open Air";
		sparrow.eat();
		sparrow.pick();

		System.out.println("======================================");

		GoldenEagle goldeneagle = new GoldenEagle();
		goldeneagle.name = "Garuda";
		goldeneagle.habitat = "Open Jungle";
		goldeneagle.foodType = "Non-veg";
		goldeneagle.eat();
		goldeneagle.hunt();
		goldeneagle.foodHabit();

		System.out.println("======================================");

		VegSparrow vegsparrow = new VegSparrow();
		vegsparrow.name = "Chudi";
		vegsparrow.habitat = "Open Air";
		vegsparrow.foodType = "Veg";
		vegsparrow.eat();
		vegsparrow.pick();
		vegsparrow.foodHabit();

	}
}
