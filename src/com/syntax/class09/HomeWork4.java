package com.syntax.class09;

public class HomeWork4 {

	public static void main(String[] args) {

		// From an array of integer elements find the largest number.

		int[] number = { 6, 10, 20, 1, 56, 2 };
		int large = 0;

		for (int numbers : number) {
			if (numbers > large) {
				large = numbers;
			}
		}
		System.out.println(large);
		
		System.out.println("_-_-_-_-");
		
		//OTHER WAY DOING THE TASK
		for (int i=0; i<number.length; i++) {
			if (number[i]>large) {
				large=number[i];
				
			}
		} System.out.println(large);

	}

}
