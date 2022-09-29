package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {

		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your grade!");

		char grade = scan.next().charAt(0);
		String expl;

		switch (grade) {

		case 'A':
			expl = "Excellent";
			break;
		case 'B':
			expl = "Good";
			break;
		case 'C':
			expl = "Average";
			break;
		case 'D':
			expl = "Bad";
			break;
		default:
			expl = "Not Acceptable";
			break;
		}
		System.out.println("Your grade " + grade + ", is " + expl);
	}

}
