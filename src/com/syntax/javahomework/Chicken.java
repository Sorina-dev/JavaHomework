package com.syntax.javahomework;

public class Chicken {
	
	//create a class of Chicken
	//create a couple of chicken objects
	//print the number of chicken
	
	String name;
	int age;
	static int count;
	
	public static void main(String[] args) {
		
		Chicken c1 = new Chicken();
		c1.name = "Golden";
		c1.age = 2;
		count ++;
		
		Chicken c2 = new Chicken();
		c2.name = "Yellow";
		c2.age = 3;
		count ++;
		
		Chicken c3 = new Chicken();
		c3.name = "Sun";
		c3.age = 1;
		count ++;
		
		
	System.out.println("The total number of chicken is " + Chicken.count);
		
	}
	

}
