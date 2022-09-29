package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		/*
		 * 2. Write a program for user to enter his/hers birth month. Based on the month define the season.
			Example: if user is born in March, April, May → season =”Spring” 
			if user is born in June, July, August → 
			season =”Summer”  etc …
		 */
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your birthday month!");
		
		String month=scan.nextLine();
		String season=null;
		
		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			season="Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Autumn";
		} else {
			System.out.println("Invalid month");
		}
		System.out.println("You were born in "+season);
	}

	
}
