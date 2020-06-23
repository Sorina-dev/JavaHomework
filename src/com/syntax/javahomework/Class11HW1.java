package com.syntax.javahomework;

public class Class11HW1 {
	public static void main(String[] args) {
		// Create a 2D array that first row will contain 4 names and second row will
		// contain grades.
		// Then your program should print name of the students that has A and B grade

		String[][] names = { { "Anna", "John", "Maria", "David" }, { "A", "B", "C", "D" } };
		System.out.println("Student " + names[0][0] + " has " + names[1][0] + " grade.");
		System.out.println("Student " + names[0][1] + " has " + names[1][1] + " grade.");

		System.out.println("***********************************************************");

		// Create a 2D array where you will store the following values: Mr, Mrs, Ms,
		// Miss and Smith, Jordan, Jackson, Obama.
		// After storing values print the following:Mrs Smith, Mr Obama, Ms Jackson,
		// Miss Jordan.

		String[][] names1 = { { "Mr", "Mrs", "Ms", "Miss" },

				{ "Smith", "Jordan", "Jackson", "Obama" } };

		System.out.print(names1[0][1] + " " + names1[1][0] + ", ");
		System.out.print(names1[0][0] + " " + names1[1][3] + ", ");
		System.out.print(names1[0][2] + " " + names1[1][2] + ", ");
		System.out.print(names1[0][3] + " " + names1[1][1] + ". ");

	}
}
