package com.syntax.class07;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {

		/*
		 * 6. Declare a variable to store a price for a coffee. Ask the user to pay for
		 * a coffee. Keep asking to pay for coffee until the user enters the EXACT
		 * amount . If the user gives more than coffee price --> ask them to give less,
		 * if the user gives less money then ask to give more. Once user give EXACT
		 * amount print “Please enjoy your coffee
		 */

		int price = 3;
		Scanner scan = new Scanner(System.in);
		int value;

		System.out.println("Pay for your coffee!");

		do {
			value = scan.nextInt();
			if (value > price) { // if VALUE is bigger than the price
				System.out.println("Give less");
			} else if (value < price) { // if VALUE is less than the price
				System.out.println("Give more");
			}
		} while (value != price);
		System.out.println("Please enjoy your coffee");
	}

}
