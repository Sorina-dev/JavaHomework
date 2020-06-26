package com.interview.questions;

public class PrimeNumber {
public static void main(String[] args) {
	//Write a java program to check whether a given number is prime or not?
	
	//Note: 0 and 1 are not prime numbers. 
	//The 2 is the only even prime number because all the other 
	//even numbers can be divided by 2.
	// Prime number is a number that is greater than 1 and divided by 1 or itself only
	//2, 3, 5, 7, 11, 13, 17...
	
	  int num = 29;
      boolean isPrime = false;
      for(int i = 2; i <= num/2; ++i)
      {
          // condition for nonprime number
          if(num % i == 0)
          {
              isPrime = true;
              break;
          }
      }

      if (!isPrime)
          System.out.println(num + " is a prime number.");
      else
          System.out.println(num + " is not a prime number.");
      
   // Write a java program to find the second largest number in the array?
  	// Maximum and minimum number in the array?

  	
//  		int[] numbers = { 32, 61, 16, 89, 74, 92 };
//
//  		int largest = numbers[0];
//  		int largest2 = numbers[0];
//
//  		int min = numbers[0];
//
//  		for (int num : numbers) {
//
//  			if (num > largest) {
//  				largest2 = largest;
//  				largest = num;
//  			} else if (num > largest2 && num != largest) {
//  				largest2 = num;
//  			} else if (num < min) {
//  				min = num;
//  			}
//
//  		}
//
//  		System.out.println("The minimum is: " + min);
//  		System.out.println("The largest is: " + largest);
//  		System.out.println("Second largest : " + largest2);

  		// Let's try to find the maximum

//  		// 1st way
//  		int max = numbers[0];
//  		int min = numbers[0];
//  		for (int num : numbers) {
  //
//  			if (num > max) {
//  				// I found a bigger number
//  				max = num;
//  			} else if (num < min) {
//  				// I found a smaller number
//  				min = num;
//  			}
  //
//  		}
  //
//  		System.out.println("Maximum is: " + max);
//  		System.out.println("Minimum is: " + min);
  //
//  		// 2nd way
//  		System.out.println("---Sorting---");
//  		Arrays.sort(numbers); // This will sort the array from the smallest to the largest
  //
//  		System.out.println("Minimum is: " + numbers[0]); // The first element
//  		System.out.println("Maximum is: " + numbers[numbers.length - 1]); // The last element
//  		System.out.println("Second largest : " + numbers[numbers.length - 2]);

	
}
}
