package com.syntax.javahomework21;
//related to Aa class
public class AaTest {
	public static void main(String[] args) {
		
	
	Aa me = new Aa();
	me.name = "Sorina";
	me.age = 32;
	me.myNameAge();
	
	Bb child= new Bb();
	child.childName = "Evelina";
	child.gen= "girl";
	child.childAge = 6;
	child.childInfo();
	child.printF();
	
	}
}
