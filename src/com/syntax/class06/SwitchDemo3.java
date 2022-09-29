package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String[] args) {
		
		/*
		 * we need to ask a user where he/she is from
		 * based on the country -> define favorite food
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		
		String country=scan.nextLine();
		String favoriteFood;
		
		switch (country) {
		
		case "USA":
			favoriteFood="burgers and fries";
			break;
		case "Kazakhstan":
			favoriteFood="beshparmak";
			break;
		case "Turkey":
			favoriteFood="kebab";
			break;
		case "Venezuela":
			favoriteFood="arepa";
			break;
		case "Finland":
			favoriteFood="fish soup";
			break;
		case "India":
			favoriteFood="chicken curry";
			break;
		case "Italy":
			favoriteFood="spaghetti and pizza";
			break;
		case "Morocco":
			favoriteFood="couscous";
			break;
		default:
			favoriteFood="unknown";
			break;
			
		}
		
		System.out.println("You are from "+country+" an your favorite food is "+favoriteFood);
		
	}

}
