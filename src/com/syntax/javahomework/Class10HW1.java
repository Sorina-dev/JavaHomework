package com.syntax.javahomework;

public class Class10HW1 {
public static void main(String[] args) {
	
	//Create an array of chars and store grades into it: A,B,C,D,E,F. 
	//Then print a grade B (use 2 different ways of creating an array).
	
	 char[] grades1;
	 grades1 = new char[6];
	 grades1[0] = 'A';
	 grades1[1] = 'B';
	 grades1[2] = 'C';
	 grades1[3] = 'D';
	 grades1[4] = 'E';
	 grades1[5] = 'F';
	 
	char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
	System.out.println("Grade "+ grades1[1]);
	System.out.println("grade "+ grades[1]);
	
	
	
}
}
