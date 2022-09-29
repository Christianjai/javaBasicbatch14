package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {

		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your 1st number");
		double num1 = scan.nextDouble();
		System.out.println("Enter your 2nd number");
		double num2 = scan.nextDouble();
		System.out.println("Enter your operator");
		char operator = scan.next().charAt(0);

		if (operator == '+') {
			System.out.println(num1 + num2);

		} else if (operator == '-') {
			System.out.println(num1 - num2);
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		}

	}

}
