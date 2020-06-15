package com.syntax.javahomework;

public class HW1Class07 {
public static void main(String[] args) {
	//Print numbers from 1 to 100 in 1 line with space
	
	int x = 1;
	while (x <= 100) {
		System.out.print(x + " ");
		x++;
	}
	System.out.println();
	System.out.println("*****************************************");
	
	//Print numbers from 100 to 1
	int y = 100;
	while ( y >= 1) {
		System.out.print(y + " ");
		y--;
	}
	System.out.println();
	System.out.println("******************************************");
	
	//Print even numbers from 20 to 1 (2 ways)
	int z = 20;
	while (z >= 1) {
		System.out.print(z + " ");
		z -= 2;
	}
	System.out.println();
	System.out.println("****************************************");
	
	int a = 20;
	while(a > 1) {
		if(a % 2 == 0) {
		System.out.print(a + " ");
		} 
		a--;
	}
	
}
}
