package com.syntax.javahomework;

public class Class15HW1 {
	public static void main(String[] args) {

		// How would you reverse a String character by character?
		String name = "Alexandra";
		String reversedName = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reversedName += name.charAt(i);
		}
		System.out.println(reversedName);
		System.out.println("***********************************************");

		// How would you reverse a String word by word?

		String sentence = "Outside is raining";
		String[] array = "Outsise is raining".toLowerCase().split(" ");
		String reversedsentence = "";

		for (int i = array.length - 1; i >= 0; i--) {
			reversedsentence += array[i] + " ";
		}
		System.out.print(reversedsentence);
		System.out.println();
		System.out.println("***************************************************");

		// How would you check if String is palindrome or not?

		String tree = "copac";
		String reverse = "";

		for (int i = tree.length() - 1; i >= 0; i--) {
			reverse += tree.charAt(i);
		}

		boolean palindrome = true;
		for (int i = 0; i < tree.length(); i++) {
			if (tree.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			} else {
				
			}

		}
		System.out.println("Polindrome!");
		System.out.println("******************************************");
		//How would you swap  2 strings without a temporary variable?
		
		String animal1 = "tiger";
		String animal2 = "panthera";
		
		animal1 = animal1 + animal2;
		animal2 = animal1.substring(0, animal1.length() - animal2.length());
		animal1 = animal1.substring(animal2.length());
		
		System.out.println(animal1 + " " + animal2);
		
		
	}
}
