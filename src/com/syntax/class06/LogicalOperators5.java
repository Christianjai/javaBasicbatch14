package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperators5 {
	public static void main(String[] args) {
		
		
		// VERY GOOD EXAMPLE OF ! (NOT) OPERATOR
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter country");
		String country=scan.nextLine();
		
		if (!country.equals("Korea")) {
			System.out.println("Welcome to USA");
		} else {
			System.out.println("Thank you and bb");
		}
	}

}
