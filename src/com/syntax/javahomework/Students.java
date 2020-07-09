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
		Students.numberOfStudents ++;

		Students s2 = new Students();
		s2.name = "Anna";
		s2.studentID = 287;
		Students.numberOfStudents ++;

		Students s3 = new Students();
		s3.name = "Ben";
		s3.studentID = 567;
		Students.numberOfStudents ++;

		System.out.println("Student name is " + s1.name + " with the student ID " + s1.studentID
				+ ". The total number of students is " + numberOfStudents);
		System.out.println("Student name is " + s2.name + " with the student ID " + s2.studentID
				+ ". The total number of students is " + numberOfStudents);
		System.out.println("Student name is " + s3.name + " with the student ID " + s3.studentID
				+ ". The total number of students is " + numberOfStudents);

	}

}
