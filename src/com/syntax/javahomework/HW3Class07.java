package com.syntax.javahomework;

import java.util.Scanner;

public class HW3Class07 {
public static void main(String[] args) {
	// We are playing a lottery game and the lucky number is 17; 
	//We want to keep asking the user to enter any numbers from 1-20; 
	//until he guesses the lucky number --> In that case we print "Congrats, you won!"
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any number from 1-20");
	boolean answer= true;
	while(answer) {
		int num = scan.nextInt();
		if(num==17) {
		System.out.println("Congrats, you won!");
		}else if (num<=20 && num>0) {
			System.out.println("Please enter any number from 1-20");
		}else {
			System.out.println("Invalid number");
		}
	}
	
}
}
