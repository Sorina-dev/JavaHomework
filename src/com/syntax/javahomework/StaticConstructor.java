package com.syntax.javahomework;

public class StaticConstructor {

	static String name;
	
	 StaticConstructor(String name) { //not allowing to make static
		this.name = name;
	}
	void x() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		StaticConstructor x1 = new StaticConstructor("Angel");
		x1.x();
	}
}
