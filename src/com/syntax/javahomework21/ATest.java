package com.syntax.javahomework21;
//related to A class
public class ATest {
	public static void main(String[] args) {
		
		A wildAnimals = new A();
		wildAnimals.number= 2000;
		wildAnimals.paws = 4;
		wildAnimals.tail = true;
		wildAnimals.hunt();
		wildAnimals.sleep();
		wildAnimals.facts();
	
		B lion= new B();
		lion.color = "orange";
		lion.fur = "soft";
		lion.number = 10;
		lion.teeth = "strong";
		lion.roar();
		
		C cub = new C();
		cub.smell = "milk";
		cub.fur = "soft";
		cub.milk();
		cub.play();
	}

}
