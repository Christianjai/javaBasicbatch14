package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {
	public static void main(String[] args) {

		/*
		 * windows cntrl + shift + o = you will get automatically scanner after typing it
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");

		// to capture different values we need to use different options
		String name = input.next(); // capturing String

		System.out.println("How old are you " + name + "?");
		int age = input.nextInt();

		System.out.println("Hello " + name + " you are " + age + " years old");

		System.out.println("How much money you have " + name);

		double money = input.nextDouble();

		System.out.println(name + " has " + money + "$");

		System.out.println(name + " what is your grade?");

		char grade = input.next().charAt(0); // !!!!!!!!!!!! this is how you store CHARACTERS

		System.out.println(name + " your grade is " + grade);

	}

}
