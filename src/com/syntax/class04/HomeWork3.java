package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*Create a Java program that will ask if user has a credit card or not.
		 *If you user does not have a credit card then offer them. 
		 *If they do have one ask what is balance on the card? 
		 *If balance of the card is larger than 1000, tell them to pay off immediately, 
		 *otherwise you can tell them that they can spend more.
		*/
		Scanner scan= new Scanner (System.in);
		System.out.println("Do you have a credit card?");
		boolean credit=scan.nextBoolean();
		
		if (credit) {
			System.out.println("Do you have balance on your credit card and if you do how much?");
			int balance=scan.nextInt();
			if (balance>1000) 
			System.out.println("Pay off immediatly");
			else  
			System.out.println("you can spend more");
			
			
			
		} else {
			System.out.println("Would you like to get a credit card?");
			
		}
		
		}
			
	}

		
		
		