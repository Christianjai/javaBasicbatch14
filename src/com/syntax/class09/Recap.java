package com.syntax.class09;

public class Recap {
	public static void main(String[] args) {
		
		boolean day=true;
		
		for (int i=1; i<=3; i++) {
			while (day) {  // day is either true & false
				System.out.println("Good day");
				break;
			}
			System.out.println(i);
			
		}
	}

}
