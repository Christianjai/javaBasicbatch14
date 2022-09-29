package com.syntax.class12;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		/*
		 * 	Write a program that reads two people's first
			names and if they expecting boy or girl? 
			Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter mothers name");
		String mom=scan.nextLine().toUpperCase();
		System.out.println("Enter fathers name");
		String dad=scan.nextLine().toUpperCase();
		System.out.println("boy or a girl?");
		String gender=scan.nextLine();
		
		if (gender.equals("boy")) {
			System.out.println("Suggested name: "+dad.substring(0,3)+mom.substring(mom.length()-3,mom.length()));
		} else {
			System.out.println("Suggested name: "+mom.substring(0,2)+dad.substring(dad.length()-3,dad.length()));
		}
		
		
		
	}

}
