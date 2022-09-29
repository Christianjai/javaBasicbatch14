package com.syntax.class13;

import utils.StringUtils;

public class StringDemo2 {
	
	public static void main(String[] args) {
		String str="Thor love and thunder";
		
		 //for (int i=0; i<str.length(); i++) {
			//if(str.charAt(i)=='o') {
				//System.out.println(i);
		
		// It is importing from (package utils/StringUtils)
		StringUtils strUtils= new StringUtils();
		strUtils.printAllIndexes(str, 'e');
		}
		
	}


