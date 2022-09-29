package com.syntax.class12;

import java.util.Arrays;

public class Task2 {
	
	public static void main(String[] args) {
		
		/*
		 *Create a String and if the String is not empty perform the following: 
		 *if the String has an odd number of characters and has 3 or more characters,
		 */
		
		String str="Christian";
		
		
		if (!str.isEmpty()) {
			if (str.length()%2!=0 && str.length()>=3) {
				System.out.println(str.charAt(str.length()/2));
				
			}
		}
		
		// Other way of doing it
		String str1="hello";
	    int length=str1.length();
	    if(!str1.isEmpty()&&length%2!=0&&length>=3) {

	        int middleIndex=length/2;
	        System.out.println(str1.charAt(middleIndex));
	    }
	}
	}
			

	
			
			
			


