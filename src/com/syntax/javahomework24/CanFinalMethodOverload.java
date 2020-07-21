package com.syntax.javahomework24;

public class CanFinalMethodOverload {
// yes --> final method can be overloaded
	public static void main(String[] args) {
		
		FinalMehod fm = new FinalMehod();
		fm.add(8, 9);
		fm.add(10, 12, 13);
		
	} 
}
class FinalMehod{
	
	final void add(int i, int j){
		System.out.println(i + j);
	}
	
	final void add (int i, int j, int k) {
		System.out.println(i + j + k);
	}
}