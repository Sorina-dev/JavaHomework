package com.syntax.javahomework;

public class Class10HW2 {
	public static void main(String[] args) {
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
		String[] names = new String[5];
		names[0]= "Vova";
		names[1]= "Feghea";
		names[2]= "Ivan";
		names[3]= "Sorina";
		names[4]= "Valea";
		
		String[] group = {"Vova","Feghea", "Ivan","Sorina","Valea"};
		
		System.out.println(names[3]);
		System.out.println(group[3]);
	}

}
