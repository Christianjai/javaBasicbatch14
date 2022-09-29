package com.syntax.class12;

public class StringDemo8 {
	
	public static void main(String[] args) {
		
		// replace will replace words
		
		String str="Batch 14 is good 12838123!@#¤%% ASDASDASD kasdjasd";
		
		/*
		 * replace -> method replaces one String with another in a String
		 * replaceAll -> it takes a pattern and replaces all the characters that follow
		 * that pattern
		 */
		
		System.out.println(str.replace("good", "Excellent"));
		System.out.println(str.replaceAll("[a-z]", ""));
		
	}

}
