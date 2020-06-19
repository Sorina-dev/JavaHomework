package com.syntax.javahomework;

public class Class09HW2 {
public static void main(String[] args) {
//	Print the following pattern:
//		*
//		**
//		***
//		****
//		*****
	for (int x = 5; x >= 1; x--) {
		for (int y = x; y <=5; y++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("------------------------------------------------------");
//	Print the following pattern:
//		55555
//		4444
//		333
//		22
//		1
	for (int f = 5; f >= 1; f--) {
		for (int g = f; g >= 1; g--) {
				System.out.print(f);
			}
		System.out.println();
		}
		
	}
	
}

