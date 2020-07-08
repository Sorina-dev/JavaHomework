package com.syntax.javahomework;

public class Students {
	/*
	 * Create a Class called Students Create three variables studentName , studentID
	 * and numberOfStudents Create three objects of the Students Class Set the value
	 * for studentName , studentID and increment the numberOfStudents for each
	 * object Print out total number of students
	 */

	String name;
	int studentID;
	static int numberOfStudents;

	public static void main(String[] args) {

		Students s1 = new Students();
		s1.name = "Maria";
		s1.studentID = 233;
		s1.numberOfStudents = 1;

		Students s2 = new Students();
		s2.name = "Anna";
		s2.studentID = 287;
		s2.numberOfStudents = 2;

		Students s3 = new Students();
		s3.name = "Ben";
		s3.studentID = 567;
		s3.numberOfStudents = 3;

		System.out.println("Student name is " + s1.name + " with the student ID " + s1.studentID
				+ ". The total number of students is " + numberOfStudents);
		System.out.println("Student name is " + s2.name + " with the student ID " + s2.studentID
				+ ". The total number of students is " + numberOfStudents);
		System.out.println("Student name is " + s3.name + " with the student ID " + s3.studentID
				+ ". The total number of students is " + numberOfStudents);

	}

}
