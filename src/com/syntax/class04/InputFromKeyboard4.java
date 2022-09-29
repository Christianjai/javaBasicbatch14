package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your full name");
		String name=scan.nextLine();
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		
		System.out.println("Hello "+name+" you are "+age);
		
		
		
		
		

	}

}
