package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter a number");
		
		int number=scan.nextInt();
		
		if (number> 1 && number<=10) {
			System.out.println("Small number");
		} else if (number>11 && number<=100) {
			System.out.println("Medium number");
		} else if (number>101 && number<=1000) {
			System.out.println("Large number");
		}

	}

}
