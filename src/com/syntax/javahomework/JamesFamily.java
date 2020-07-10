package com.syntax.javahomework;

public class JamesFamily {

	static String lastName = "James";
	static int members;
	String firstName;
	int age;
	
	static void general() {
		System.out.println(lastName + " family consists of " + members + " members.");
	}

		
	public static void main(String[] args) {
		
		JamesFamily mom = new JamesFamily();
		mom.firstName = "Ann";
		mom.age = 32;
		members++;
		
		JamesFamily dad = new JamesFamily();
		dad.firstName = "John";
		dad.age = 35;
		members++;
		
		JamesFamily sister = new JamesFamily();
		sister.firstName = "Maya";
		sister.age = 6;
		members++;
		
		JamesFamily brother = new JamesFamily();
		brother.firstName = "Daniel";
		brother.age = 4;
		members++;
		
		JamesFamily baby = new JamesFamily();
		baby.firstName = "Dominic";
		baby.age = 1;
		members++;
		
		general();
		System.out.println(" Mother's name is "+ lastName + " "+ mom.firstName + ", she is " +mom.age + " years old" );
		System.out.println(" Father's name is "+ lastName + " "+ dad.firstName + ", he is " +dad.age + " years old" );
		System.out.println(" Sister's name is "+ lastName +  " "+sister.firstName + ", she is " +sister.age + " years old" );
		System.out.println(" Brother's name is "+ lastName + " "+ brother.firstName + ", he is " +brother.age + " years old" );
		System.out.println(" Baby's name is "+ lastName +  " "+baby.firstName + ", he is " +baby.age + " years old" );

	}
	
	
}
