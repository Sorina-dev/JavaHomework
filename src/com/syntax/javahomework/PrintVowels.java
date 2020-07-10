package com.syntax.javahomework;

public class PrintVowels {

	//Create a method that will accept a String as a parameter and return a new String
	//that consist only of vowels. Method should be available inside the class where 
	//it was declared and executed by calling it is name.
	
	protected static String vowels(String s){
		String newString = "";
		newString = s.replaceAll("[^aeuioAEUIO]","");
	 return newString;
	}
	
	public static void main(String[] args) {
		
		System.out.println(vowels(" I love Summer"));
	}
}
