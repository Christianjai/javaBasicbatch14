package com.syntax.class12;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		String firstName="Christian";
		String lastName="Jailojan";
		System.out.println(firstName+" "+lastName); // Mostly this is used 
		System.out.println(firstName.concat(" ").concat(lastName));
		
		String str=" ";
		
		/*
		 * isEmpty() returns true if a String is empty this method will return false even if you have
		 * a space in String variable however the isBlank method does not count spaces
		 */
		
		System.out.println(str.isEmpty());
		//System.out.println(str.isBlank()); NEED NEWER VERSION OF JAVA
	}

}
