package com.syntax.javahomework24;
/*
 * Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 

Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */

 public class Student {

	public void studyHard() {
		System.out.println("Students study hard");
	}
	protected void doHW() {
		System.out.println("Students do homework");
	}

}
class SyntaxStudent extends Student{
	
	public void studyHard() {
		System.out.println("Syntax students study coding");
	}
	
	void studyJava() {
		System.out.println("Syntax Students study Java.");
	}
}
class CollegeStudent extends Student{
	 
	protected void doHW() {
		System.out.println("College students have their homeowork verified daily ");
	}
	public void learnProf() {
		System.out.println("College students learn a proffesion");
	}
}
class SchoolStudent extends Student{
	
	public void doHW() {
		System.out.println("Sometimes School students don't do their homework");
	}
	
	void havefun() {
		System.out.println("School students have a lot of fun at school");
	}
}
