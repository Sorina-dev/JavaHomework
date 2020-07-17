package com.syntax.javahomework23;

/*
 * Create 1 class with a static method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result.
 */
public class Overload {
	static void sum(int i, int j) {
		System.out.println(i + j);
	}

	static void sum(int i, int j, int l) {
		System.out.println(i + j + l);
	}

	static void sum(double a, double b, int c) {
		System.out.println(a + b + c);
	}
 public static void main(String[] args) {
	 Overload m = new Overload();	
	 m.sum(3, 4);
	 m.sum(3, 5, 8);
	 m.sum(5.5, 4.6, 4);
}
	
}

