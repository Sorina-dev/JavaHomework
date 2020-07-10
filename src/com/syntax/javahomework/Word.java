package com.syntax.javahomework;

public class Word {
	// Create a method that will take a String as a parameter and returns reversed String.
	 //  Method should be available to all classes within your project and accessible by class name.
	public static String reverse (String a) {
		
		String newString = "";
		
		for (int i = a.length() - 1; i >= 0; i--) {
			
			newString += a.charAt(i);
		}
		System.out.println(newString);
		
		return newString;
	}


	public static void main(String[] args) {
		
		Word name= new Word();
		Word.reverse("Magdalena");
	}
}
