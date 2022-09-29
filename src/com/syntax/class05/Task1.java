package com.syntax.class05;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("How tall are you?");
		
		int height=scan.nextInt();
		
		if (height<=60 && height<72) {
			System.out.println("short");
		} else if (height>60 && height<73) {
			System.out.println("medium");
		} else if (height>72) {
			System.out.println("tall");
		}
	
	
}
}
