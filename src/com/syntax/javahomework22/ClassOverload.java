package com.syntax.javahomework22;
/*
 * Create 1 class with a private method that has 3 overloaded forms.
 *  Then call each overloaded method with specific arguments and observe result.
 */
public class ClassOverload {
 private void mult(int a, int b) {
	 System.out.println(a*b);
 }
 private void mult(int a, int b, int c) {
	 System.out.println(a*b*c);
 }
 private void mult(double a, double b, double c) {
	 System.out.println(a*b*c);
 }
 public static void main(String[] args) {
	
	ClassOverload m = new ClassOverload();
	m.mult(5, 6);
	m.mult(7, 9);
	m.mult(2.4, 5.6, 7.8);
}
}
