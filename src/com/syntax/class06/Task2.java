package com.syntax.class06;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your quiz score");
		int quiz = scan.nextInt();

		System.out.println("Enter your mid term score");
		int midterm = scan.nextInt();

		System.out.println("Enter your final score");
		int finalScore = scan.nextInt();

		int average = (quiz + midterm + finalScore) / 3; // OPETTELE TÄMÄ = average tarkoittaa /
		String grade = null;

		if (average >= 90) {
			grade = "A";
		} else if (average >= 70 && average < 90) {
			grade = "B";
		} else if (average >= 50 && average < 70) {
			grade = "C";
		} else if (average < 50 && average > 0) {
			grade = "F";
		} else {
			System.out.println("Enter valid numbers!");
			grade="Invalid";
			
		}
		System.out.println(grade);

	}

}
