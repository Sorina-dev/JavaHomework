package com.syntax.javahomework23;
/*
 * Create 1 class in which create a methods that will calculate the area (volume) of 
Rectangle
Square
Box
 */
public class Area {

	void area(int height, int width) {
		System.out.println("The area of a rectangle is "+ height * width);
	}
	
	void area(int a) {
		System.out.println("The area of a square is "+ a * a );
	}
	
	void area(int length, int width, int height) {
		System.out.println("The volume of a box is "+ length * width * height);
	}
	
	public static void main(String[] args) {
		
		Area rectangle = new Area();
		rectangle.area(20, 10);
		
		Area square = new Area();
		square.area(30);
		
		Area box = new Area();
		box.area(20, 10, 15);
	}
}
