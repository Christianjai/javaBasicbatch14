package com.syntax.class04;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age.
		 * If they are 18 and older you will issue a driver licence to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Hello, welcome to DMV! What is you age?");
		int age=scan.nextInt();
		if (age>18) {
			System.out.println("We can give you a driver licence!");
		} else {
			System.out.println("Sorry, we cant give you a divers license, but we can offer you learners permit!");
		}

	}

}
