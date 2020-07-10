package com.syntax.javahomework;

public class ArraySum {
	
	protected int sum(int[] array) {
		int total = 0;
		for(int i : array) {
			total += i;
		}
		return total;
	}
	public static void main(String[] args) {
		ArraySum task = new ArraySum();
		int[] arr = { 23, 45, 67, 89};
		System.out.println(task.sum(arr));
	}

}
