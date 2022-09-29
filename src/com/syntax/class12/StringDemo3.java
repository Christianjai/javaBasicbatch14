package com.syntax.class12;

public class StringDemo3 {
	
	public static void main(String[] args) {
		
		String str=" i love java ";
		System.out.println(str);

		//Remove the spaces before and after the
		//String but not the ones which are present in between
		System.out.println(str.trim());
		
		
		System.out.println("- - - - - - - - - - - -");
		
		String str1="Java is very easy";
		/*
		 * startsWith-> checks if a String starts with a specific letter or word
		 * endsWith -> checks if  a String ends with a specific letter of word
		 * containsWith -> checks if a String contains a specific letter or word
		 */
		
		System.out.println(str1.startsWith("Java")); //true (because startsWith is boolean)
		System.out.println(str1.endsWith("easy")); // same as above but checks last letter
		System.out.println(str1.contains("very"));
	}

}
