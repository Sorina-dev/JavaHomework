package com.interview.questions;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {

		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 1, 1 }, { 8, 3, 1, 2 } };
		
		for (int[] i : a) {
			for (int j : i) {
				int largest = a[0][0];
				if (j > largest) {
					largest = j;
				}
				System.out.println(j);
				}
			
			}
		
		}
	}

