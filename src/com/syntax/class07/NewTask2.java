package com.syntax.class07;

import java.util.Scanner;

public class NewTask2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int secret = 30;
		System.out.println("Guess the number");
		int guess = 0;

		do {
			guess = scan.nextInt();
			if (guess > secret) {
				System.out.println("LESS");
			} else if (guess < secret) {
				System.out.println("MORE");

			}
		} while (guess != secret);
		System.out.println("You won");

	}

}
