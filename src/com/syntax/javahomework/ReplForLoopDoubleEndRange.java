package com.syntax.javahomework;

import java.util.Scanner;

public class ReplForLoopDoubleEndRange {

	public static void main(String[] args) {
		Scanner inp;
		int end;
		System.out.print("Int:");
		// write your code below
		inp = new Scanner(System.in);
		end = inp.nextInt();
		int doubleEnd = end * 2;

		for (int x = 0; x < doubleEnd; x++) {
			System.out.print(x + " ");

		}

	}
}
