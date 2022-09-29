package com.syntax.class13;

public class HW5 {
	
	public static void main(String[] args) {
		
		//How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		
		String str="Moon";
		String str2="";
		for (int i=str.length()-1; i>=0; i--) {
			str2=str2+str.charAt(i);
		}
		
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("Word is palindrome");
		} else {
			System.out.println("Word is not palindrome");
		}
		
		
	}

}
