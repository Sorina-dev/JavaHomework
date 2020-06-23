package com.syntax.javahomework;

public class Class11HW4 {
public static void main(String[] args) {
	//Create an array of countries: north america countries, south america countries,
	//europe countries, asian countries, african countries. 
	//Then print all values from that array using 2 different loops 
	//and calculate how many total countries been stored.
	
	String[] countries = {"Canada", "Colombia", "Spain", "China", "Nigeria"};
	
	for (int i = 0; i < countries.length; i++) {
		System.out.print(countries[i] + ", ");
	}
	System.out.println();
	
	System.out.println("*************************************");
	
	for (String country : countries) {
		System.out.print(country + ", ");
	}
	System.out.println();
	
	int sum = countries.length;
	System.out.println("Number of the total countries that has been stored is "+ sum);
}
}
