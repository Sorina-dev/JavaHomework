package com.syntax.javahomework;

public class Dog {

	// Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	// Labrador with specific attributes and behaviors.

	String breed;
	String size;
	String color;
	int age;

	void eat() {
		System.out.println(breed + " eats");
	}

	void run() {
		System.out.println(breed + " can run");
	}

	void sleep() {
		System.out.println(breed + " sleeps");
	}

	void name() {
		System.out.println(breed + " reacts at his name");
	}

	public static void main(String[] args) {

		Dog d1 = new Dog();

		d1.breed = "Bulldog";
		d1.size = "large";
		d1.color = "light grey";
		d1.age = 5;

		d1.eat();
		d1.run();
		d1.sleep();
		d1.name();

		System.out.println("*******************************");
		
		Dog d2 = new Dog();

		d2.breed = "Beagle";
		d2.size = "large";
		d2.color = "orange";
		d2.age = 6;

		d2.eat();
		d2.run();
		d2.sleep();
		d2.name();

		System.out.println("*******************************");
		
		Dog d3 = new Dog();

		d3.breed = "German shepard";
		d3.size = "large";
		d3.color = "white and orange";
		d3.age = 6;

		d3.eat();
		d3.run();
		d3.sleep();
		d3.name();
	}

}
