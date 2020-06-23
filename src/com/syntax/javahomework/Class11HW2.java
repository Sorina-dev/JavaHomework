package com.syntax.javahomework;

public class Class11HW2 {

	public static void main(String[] args) {
		// Create a 2D array on integer type where you will store odd and even numbers
		// in 3 rows
		// and 4 columns. Develop a program which will identify/print the even numbers
		// only.

		int[][] numbers = { { 2, 5, 7, 4 }, { 9, 10, 24, 44 }, { 77, 84, 90, 106 } };
		int row = numbers.length;
		int col = numbers[0].length;

		System.out.print("Even numbers :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (numbers[i][j] % 2 == 0) {
					System.out.print(numbers[i][j] + " ");
				}
			}

		}
		System.out.println();
		System.out.println("****************************************************");
		// Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		// Print the sum of all numbers.
		int[][] nums = { { 5, 9, 7 }, { 9, 10, 11 }, { 5, 8, 6 } };
		int sum = 0;
		int totalSum = 0;
		for (int row1 = 0; row1 < nums.length; row1++) {
			for (int col1 = 0; col1 < nums[row1].length; col1++) {
				sum += nums[row1][col1];
			}

		}
		totalSum = sum;
		System.out.println("The sum of all numbers is " + totalSum);
	}
}
