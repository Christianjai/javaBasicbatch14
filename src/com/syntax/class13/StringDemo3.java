package com.syntax.class13;

public class StringDemo3 {
	
	public static void main(String[] args) {
		// THIS IS HOW YOU REPLACE you need to put "[]" and info inside and the 
		String str="sasdadASDASDKASD12112333123312392838752378!!@@££$$";
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[0-5]", ""));
		System.out.println(str.replaceAll("[a-z]", ""));
		System.out.println(str.replaceAll("[a-k]", ""));
		System.out.println(str.replaceAll("[A-Z]", ""));
	}

}
