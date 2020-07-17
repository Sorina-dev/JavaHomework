package com.syntax.javahomework22;
/*
 * Create a class named ‘Programming’. While creating an object of the class, 
 * if nothing is passed to it, then the message “I love programming languages” 
 * should be printed. If some String is passed to it, then in place of “programming 
 * languages” the value variable should be printed. Example, if we pass “Java”, then
 *  “I love Java” should be printed.

 */
public class Programming {
	String a;                 
	static String b = "I love";   
	
	Programming(){               //non argument costructor
		System.out.println("I love programming languages");
	}
	Programming(String a){      //constr that calls the other
		this(a,b);
		this.a = a;
	}
	
	Programming(String a, String b){     // constr that will print the other version
	this.b = b;
	System.out.println(b + " "+ a);
	}
   
public static void main(String[] args) {

	Programming p = new Programming("Java");
	
}
}
