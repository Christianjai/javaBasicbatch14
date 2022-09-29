package com.syntax.class09;

public class HomeWork5 {

	public static void main(String[] args) {
		
		//Create an array to store char values and then print those in reverse order
		
		
		char[] grade= {'A','B','C','D','E','F'};
		
		int letters=grade.length;
		for (int i=letters-1; i>=0; i--) {
			System.out.println(grade[i]);
		}
		
		
	}

}
