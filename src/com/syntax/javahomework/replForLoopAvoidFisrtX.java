package com.syntax.javahomework;

import java.util.Scanner;

public class replForLoopAvoidFisrtX {
	public static void main(String[] args) {
		Scanner inp;
	    int x;
	    System.out.print("In:");
	    
	    //Write a for loop that will print out
	    //a series of numbers starting at one less than x and ending at 0.
	    //In: 7
	   // 6 5 4 3 2 1 0
	   inp = new Scanner(System.in);
	   int start = inp.nextInt();
	   
	    for (x = start; x >= 0; x--) {
	    	 
	    	 if (x == start) {
	    		 continue;
	    	 }System.out.println(x);
	    }
	    
	    
	}

}
