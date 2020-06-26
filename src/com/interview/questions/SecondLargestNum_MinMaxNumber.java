package com.interview.questions;

public class SecondLargestNum_MinMaxNumber {
public static void main(String[] args) {
	//Write a java program to find the second largest number in the array? 
	//Maximum and minimum number in the array?
	
	int numbers[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	int largest = numbers[0];
	int secondLargest = numbers[0];
	
	System.out.println("The given array is:" );
	for (int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i]+"\t");
	}
	for (int i = 0; i < numbers.length; i++) {

		if (numbers[i] > largest) {
			secondLargest = largest;
			largest = numbers[i];

		} else if (numbers[i] > secondLargest) {
			secondLargest = numbers[i];

		}
	}

	System.out.println("\nSecond largest number is:" + secondLargest);
	System.out.println("**********max and min values****************");
	
	int max = numbers[0];
	int min = numbers[0];
	// iterate and compare from array index 1
	for(int i = 1; i < numbers.length; i++){
		if(max < numbers[i]){
			max = numbers[i];
		}else if(min > numbers[i]){
			min = numbers[i];
	   }		   		   
	}
	System.out.println("Maximum number = " 
	     + max + " Minimum number = " + min);	
	
	}
}

