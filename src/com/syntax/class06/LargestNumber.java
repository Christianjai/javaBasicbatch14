package com.syntax.class06;

public class LargestNumber {

	public static void main(String[] args) {

		// find the largest number and then find if the largest number is even or odd?
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		int largest=0;
		

		if (num1 > num2 && num1 > num3) {
			largest=num1;
		} else if (num2 > num3 && num2 > num1) {
			largest=num2;
		} else if (num3 > num1 && num3 > num2) {
			largest=num3;
		}
		System.out.println(largest+" is the largest number");

		if (largest%2==0) {
			System.out.println(largest+" is even number");
		}else {
			System.out.println(largest+" is odd number");
		}

	
	}


} 
