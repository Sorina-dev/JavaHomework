package com.interview.questions;

public class FibonacciNumbers {
public static void main(String[] args) {
	//Write a Java Program to print the first 10 numbers of Fibonacci series.
	//The Fibonacci series is a series where the next term is the sum of pervious two terms. 
	//The first two terms of the Fibonacci sequence is 0 followed by 1.
	
	System.out.println("-----------using for loop ----------------");
	 int n = 10, t1 = 0, t2 = 1;
     System.out.print("First " + n + " terms: ");

     for (int i = 1; i <= n; ++i)
     {
         System.out.print(t1 + " , ");

         int sum = t1 + t2;
         t1 = t2;
         t2 = sum;
     }
     System.out.println();
     System.out.println("--------using while loop---------------");
     
     int i = 1, m = 10, f1 = 0, f2 = 1;
     System.out.print("First " + m + " terms: ");

     while (i <= m)
     {
         System.out.print(f1 + " , ");

         int sum = f1 + f2;
         f1 = f2;
         f2 = sum;

         i++;
     }
     
  // Write a Java Program to print the first 10 numbers of Fibonacci series.
 	// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

// 	public static void main(String[] args) {
// 		int a, b, c;
// 		a = 1;
// 		b = 1;
//
// 		for (int i = 1; i <= 10; i++) {
// 			System.out.print(a + " ");
// 			c = a + b;
// 			a = b;
// 			b = c;
// 		}

 		// HW try to do it with only 2 variables
 		// Galamat: Try to do it with no variables

     
}
}
