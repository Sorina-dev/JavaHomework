package com.syntax.javahomework;

import java.util.Scanner;

public class Class08HW1 {
	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the start point of range");
		int start = scan.nextInt();
		System.out.println("Please enter the end point of range");
		int end = scan.nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		int x;
		for (x = start; x <= end; x++) {
			System.out.println(x);
			if (x % 2 == 0) {
				sumEven += x;
			}
			if (x % 2 == 1) {
				sumOdd += x;
			}
		}
		System.out.println("The sum of even numbers between " + start + " and " + end + " is " + sumEven);
		System.out.println("The sum of odd numbers between " + start + " and " + end + " is " + sumOdd);

	}

}
