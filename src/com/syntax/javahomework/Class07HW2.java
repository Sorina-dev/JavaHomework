package com.syntax.javahomework;

public class Class07HW2 {
	public static void main(String[] args) {

		// Print odd numbers between 20 and 50 (2 ways)

		int x = 21;
		while (x < 50) {
			if (x % 2 == 1) {
				System.out.println(x);
			}
			x += 2;
		}
		System.out.println("*************************************");

		int y = 21;
		while (y < 50) {
			System.out.println(y);
			y += 2;
		}
		System.out.println("*************************************");

		for (int a = 21; a < 50; a += 2) {
			System.out.println(a);
		}
		System.out.println("*************************************");
		int num = 21;
		do {
			System.out.println(num);
			num += 2;
		} while (num < 50);
	}
}
