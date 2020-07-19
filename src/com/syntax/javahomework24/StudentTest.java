package com.syntax.javahomework24;

public class StudentTest {
	public static void main(String[] args) {

		Student s1 = new SyntaxStudent();
		s1.studyHard();
		s1.doHW();
		
        System.out.println("-------------------------------------");
		SyntaxStudent sy = new SyntaxStudent();
		sy.studyHard();
		sy.studyJava();
		sy.doHW();

		System.out.println("--------------------------------------");

		CollegeStudent c = new CollegeStudent();
		c.studyHard();
		c.doHW();
		c.learnProf();

		System.out.println("--------------------------------------------");

		SchoolStudent ss = new SchoolStudent();
		ss.doHW();
		ss.havefun();
		ss.studyHard();
	
	}
}
