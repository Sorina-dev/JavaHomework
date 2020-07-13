package com.syntax.javahomework21;
/*
 * Write program to inherit class A that has method printF which is static 
 * and call or reuse that method into class B
 */
public class Aa {
	static String lastName= "Cristian";
	 int age;
	String name;
	static void printF() {
		System.out.println("Our lastname is "+ lastName + ".");
	}
	void myNameAge() {
		System.out.println("My name is "+ name + " and I am "+ age + " years old.");
	}

} 
class Bb extends Aa{
	String childName, gen;
	int childAge;
	
void childInfo() {		
		System.out.println("My child's name is " + childName + ", she is a " + gen + ". She is "+ childAge + " years old.");
	}
}
