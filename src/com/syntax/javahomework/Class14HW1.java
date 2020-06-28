package com.syntax.javahomework;

import java.util.Scanner;

public class Class14HW1 {
	public static void main(String[] args) {
		/*Write a program that reads two people's first
names and if they expecting boy or girl? 
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Mom's first name?");
		String momName = scan.nextLine();
		System.out.println("Dad's first name?");
		String dadName = scan.nextLine();
		System.out.println("Boy or Girl?");
		String gender = scan.nextLine();
		String baby = "boy";
		String baby1 = "girl";
		
		if (gender.equals("boy")) {
			String dad = dadName.substring(0, 3);
			String mom = momName.substring(2);
			System.out.println("Suggested baby name: " + dad.toUpperCase()+ mom.toUpperCase());
		}else if (gender.equals("girl"))  {
			String dad = dadName.substring(3);
			String mom = momName.substring(0, 2);
			System.out.println("Suggested baby name: " + mom + dad);
			
		}else {
			System.out.println("Unknown gender");
		}
		
	}

}
