package com.syntax.class10;

import java.util.Scanner;

public class GroupWork2 {

	public static void main(String[] args) {
		
		
		
		
		//Task 7.
		//Write a java program to check whether a given number is prime or not?
		
		//using scanner
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a;
		a = scan.nextInt();
		int b = 1;
		int c = 0;
		
		while (b <= a) {
			if ((a % b) == 0)
				c = c + 1;
				b++;
					
		} if (c == 2) {
			System.out.println(a + " is a prime number");
		}else {
			System.out.println(a + " is not a prime number");
		}
	}
}


