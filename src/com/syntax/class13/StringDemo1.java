package com.syntax.class13;

import java.util.Arrays;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		//substring method
		String str="Today is Sunday";
		String day=str.substring(9);
		System.out.println(day);
		System.out.println(str.substring(6,8));
		System.out.println(str.length());
		char c=str.charAt(4); //calling the method charAt on str object
		
		char[] charArr=str.toCharArray();
		
		//charAt method
		System.out.println(str.charAt(4)); //takes character from the string
		System.out.println(Arrays.toString(charArr));
		int index=str.indexOf("a");
		System.out.println(index);
		System.out.println(str.indexOf("a",6));
		
		
	}

}
