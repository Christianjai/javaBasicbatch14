package com.syntax.class10;

public class GroupWork {

	public static void main(String[] args) {
		
		// Task 7. Write a java program to check whether a given number is prime or not?
		

		int number=1; // <-- given number
		boolean prime=false;

		for (int i=2; i<=number/2; ++i) {
			if (number%i==0) {
				prime=true;
				break;
			}
		} 
		
		if (number==1) {
			System.out.println(number+" is not a prime number");
		} else if (!prime) {
			System.out.println(number+" is a prime number");
		} else {
			System.out.println(number+" is not a prime number");
	
		}
		
			
		}

	}



