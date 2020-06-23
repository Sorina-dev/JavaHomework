package com.syntax.javahomework;

public class Class11HW3 {
	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns
		// and print all values of the whole array.

		int[][] numbers = { { 5, 8, 90, 35 }, { 56, 78, 89, 24 }, { 45, 67, 34, 23 } };

		for (int[] num : numbers) {

			for (int x : num) {
				System.out.print(x + " ");
			}

		}
		System.out.println();

		System.out.println("*****************************************");

		// Create an array of cars : american, german, korean, italian.
		// Then retrieve all values from that array using 2 different loops

		String[] cars = { " Tesla", " Audi", "KIA", "Ferrari" };

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		for (String i : cars) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
