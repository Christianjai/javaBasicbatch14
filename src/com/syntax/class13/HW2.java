package com.syntax.class13;

public class HW2 {
	
	public static void main(String[] args) {
		
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
		
		String str="aslasdö!@@#zASZÖZXZ284";
		String str2=str.replaceAll("[^A-ZA-z0-9]", "");
		System.out.println(str.length());
	}

}
