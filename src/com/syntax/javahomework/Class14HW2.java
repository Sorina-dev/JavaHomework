package com.syntax.javahomework;

public class Class14HW2 {
public static void main(String[] args) {
	/*Create a String and if the String is not empty perform the following: 
if the String has an odd number of characters and has 3 or more characters,
 print the character in the middle of the String.
	 */
	
	String str = "Afternoon";
	
	if(!str.isEmpty()) {
		
		if (str.length() % 2 == 1 && str.length() >= 3) {
			int m = str.length() / 2;
			int middle = m;
			int middleOfString = (char) middle; 
			System.out.println(str.charAt(middle));
		}else {
			System.out.println("There is an even number of characters and shorter then 3");
		}
	}else {
		System.out.println("The String is empty");
	}
}
}
