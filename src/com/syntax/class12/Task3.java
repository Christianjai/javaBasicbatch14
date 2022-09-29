package com.syntax.class12;

public class Task3 {
	
	public static void main(String[] args) {
		
		/*
		 *  *print the character in the middle of the String.
		 */
		
		String str="Sunday";
						
		char[] charArray=str.toCharArray();
		for (int i=str.length()-1; i>=0; i--) { //!!!THIS IS HOW YOU REVERSE THE STRING!!!
			 System.out.print(charArray[i]);
		}
		System.out.println();
		
		//OTHER WAY OF DOING IT
		String str1="Sunday";

        for(int i=str1.length()-1;i>=0;i--) {
            System.out.print(str1.charAt(i));
        }

		 
	}

}
