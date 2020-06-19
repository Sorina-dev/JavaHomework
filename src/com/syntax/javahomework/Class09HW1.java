package com.syntax.javahomework;

public class Class09HW1 {
	public static void main(String[] args) {
		// Print the following pattern:
//		54321
//		54321
//		54321
//		54321
		for (int x = 1; x <= 5; x++) {
			for (int y = 5; y >= 1; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
		System.out.println("*************************************************");
//	Print the following pattern:
//		55555
//		44444
//		33333
//		22222
//		11111	
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
