package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Did you solve Repl assignments?");
		boolean solvedRepls= scan.nextBoolean();
		
		if (solvedRepls) {
			
			System.out.println("How many Repls you solved?");
			int nro=scan.nextInt();
			
			if (nro>=17) {
				System.out.println("You are doing great!");
			} else if (nro>10) {
				System.out.println("You are doing okay! Please complete them");
			} else {
				System.out.println("You should solve some more repls");
			}
				
		} else {
			
			System.out.println("They are very important to learn java, please solve them");
		}
		

	}

}
