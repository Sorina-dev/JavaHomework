package com.interview.questions;

public class SwappingVariables {

	public static void main(String[] args) {
		
	        
	     // Write a program to swap 2 numbers without a temporary variable?
	    		int a = 20;
	    		int b = 30;

	    		System.out.println("value of a = " + a + " value of b = " + b);

	    		a = a + b;

	    		b = a - b;

	    		a = a - b;

	    		System.out.println("value of a = " + a + " value of b = " + b);

	}

}
