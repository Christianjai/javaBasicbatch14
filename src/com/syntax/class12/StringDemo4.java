package com.syntax.class12;

public class StringDemo4 {
	
	public static void main(String[] args) {
		
		String str="Chris";
		String str2="Chris";
		String str3=new String("Chris");
		
		if (str.equals("chris")) {
			System.out.println("I found it");
			
		} else {
			System.out.println("I did not find it");
		}
		
		System.out.println("- - - - - - - - - -");
		
		/*
		 * equals -> checks if two Strings are exactly the same with exact same case
		 * equalsIgnoreCase -> checks if two Strings are exactly the same but doe not
		 * care about the case of letter
		 */
		
		if (str.equalsIgnoreCase("chris")) {
			System.out.println("I found it");
		} 
		
		
	}


}


