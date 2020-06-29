package com.syntax.javahomework;

public class Class14HW3 {
public static void main(String[] args) {
	//create a String and print it in reverse order (Sunday ->yadnuS)
	
	String day = "Sunday";
	String newString = "";
	
	for (int i = day.length() - 1; i >= 0; i--) {
		
		newString += day.charAt(i);
	}
	System.out.println(newString);

}
}
