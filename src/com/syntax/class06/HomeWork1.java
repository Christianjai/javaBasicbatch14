package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {

		/*
		 * 1. Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your country");

		String country = scan.nextLine();
		String language = null;

		switch (country) {

		case "USA":
			language = "English";
			break;
		case "Finland":
			language = "Finnish";
			break;
		case "Russia":
			language = "Russian";
			break;
		case "Spain":
			language = "Spanish";
			break;
		default:
			language = "Unknown";
			break;
		}
		System.out.println("You are from " + country + " and you speak " + language + "!");

	}

}
