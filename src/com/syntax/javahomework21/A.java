package com.syntax.javahomework21;
/*
 * Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
 *related to ATest class
 */
public class A {
	//jungle
	static boolean wild = true;
	static boolean carnivore = true;
	int number, paws;
	boolean tail;
	
	void hunt() {
		System.out.println("Animals in jungle hunt in order to have food");
	}
	void sleep() {
		System.out.println("They sleep");
	}
	void facts() {
		
	System.out.println("The jungle animals all have "+ paws + " paws and tail. They are wild = " + wild + " and carnivore = " + carnivore);
} 
}
 class B extends A{
	//lion
	 String color;
	 String fur;
	 String teeth;
	 
	void roar() {
		System.out.println("Lions can roar");
	}
 }
	class C extends B{
		// cubs
		String smell;
		
		void play() {
			System.out.println("Cubs love to play with their parents");
		}
		void milk() {
			System.out.println("Cubs drink only milk some months after being born");
		}
		
	}
	

