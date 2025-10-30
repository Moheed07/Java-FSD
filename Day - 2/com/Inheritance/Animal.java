package com.Inheritance;

class Animal {
	String name;

	void eat() {
		System.out.println(name + " is eating.");
	}

	public static void main(String[] args) {
		System.out.println("======================================");
		Tiger tiger = new Tiger();
		tiger.name = "Simba";
		tiger.habitat = "Jungle";
		tiger.eat();
		tiger.hunt();
		
		System.out.println("======================================");
		
		Deer deer = new Deer();
		deer.name = "Heeran";
		deer.habitat = "GrassLand";
		deer.eat();
		deer.graze();

		System.out.println("======================================");
		
		Monkey monkey = new Monkey();
		monkey.name = "Simba";
		monkey.habitat = "Jungle";
		monkey.eat();
		monkey.steal();
		System.out.println("======================================");
	}
}