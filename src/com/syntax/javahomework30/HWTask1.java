package com.syntax.javahomework30;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

Create an arrayList of even numbers from 1 to 50. Remove any number that
 is divisible by 5 from that arrayList.
 */
public class HWTask1 {
	
 public static void main(String[] args) {
	 
	 System.out.println("---------------1st task---------------");
	
	ArrayList<String> drinks = new ArrayList<>();
	drinks.add("champagne");
	drinks.add("wine");
	drinks.add("juice");
	drinks.add("cocktail");
	drinks.add("wisky");
	 
	for(int s = 0; s < drinks.size(); s++) {
		if(drinks.get(s).contains("a") ||drinks.get(s).contains("e")) {
			drinks.set(s, "water");
		}
	}
	System.out.println(drinks);
	
	 System.out.println("---------------2nd task---------------");
	 
	ArrayList<Integer> numbers = new ArrayList<>();
	for(int i = 2; i <51; i++) {
		if(i % 2 == 0) {
			numbers.add(i);
		}
	}
	System.out.println("ArrayList with even numbers: "+numbers);
	Iterator<Integer> it = numbers.iterator();
	while(it.hasNext()) {
		if(it.next()% 5==0) {
			it.remove();
		}
	}
	System.out.println("ArrayList without divisible numbers by 5: "+numbers);
 }	
}
