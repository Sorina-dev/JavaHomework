package com.syntax.javahomework22;
/*
 * Write program: Shape class has a constructor that takes the radius and has a subclass as 
 *  circle class. 
 * In circle class create a method to calculate the area of circle. Test your code
 */
public class Shape {
     int radius;
     
   public  Shape(int radius) {
	   this.radius = radius;
   }
	
}
class Circle extends Shape{
	public double pi;
	public Circle(int radius, double pi) {
		super(radius);
		this.pi = pi;
	}
	
	public void areaOfCircle() {
		System.out.println("Area of circle is " + radius * radius * pi);
	}
}
