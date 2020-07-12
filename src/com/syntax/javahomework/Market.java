package com.syntax.javahomework;
//related to Market1 , Market 3
public class Market {
	/*
	 * Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
	 *  1 - inside same class; 2 - from outside the class; 3 - from different class inside 
	 * different package  and observe result.
	 */
 String fruit, fish, vegetables;
 int kg, price;
 
 
 private Market(String fruit, int price) {
	 this.fruit = fruit;
	 this. price = price;
 }
 
 protected Market(String vegetables, int kg, int price) {
	 this.vegetables = vegetables;
	 this.kg = kg;
 }
 
 Market(String fruit, String vegetables, int price){
	 this.vegetables= vegetables;
	 this.fruit= fruit;
	 this.price = price;
 }
 public Market(int kg, String fish, int price) {
	 this.kg = kg;
	 this.fish=fish;
	 this.price = price;
 }
 
 void display() {
	 System.out.println("I went to the market and bought " + fruit + " at the price of " + price + " $" );
 }
 
 void display1() {
	 System.out.println("I went to the market and bought " +kg + " kg " + vegetables + " at the price of " + price + " $" );
 }
 void display2() {
	 System.out.println("I went to the market and bought "+ fruit + " and " + vegetables + " at the price of "+ price + " $");
 }
 public void display3() {
	 System.out.println("I went to the market and bought " +kg + " kg" + fish + " at the price of " + price + " $" );
 }
 
	public static void main(String[] args) {
		Market m1 = new Market("apples", 3);
		m1.display();
		
		Market m2 = new Market(" tomatoes", 2, 3);
		m2.display1();
		
		Market m3 = new Market("grape", "potatoes", 10);
		m3.display2();
		m3.display3();
	}
	
}
