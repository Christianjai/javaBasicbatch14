package com.syntax.class07;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {

		// 5. Prompt the user to ask the name 3 times and print "Good afternoon +name...

		for (int num = 1; num <= 3; num++) {
			System.out.println("Please enter your name");
		}
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Good afternoon " + name);

	}

}
