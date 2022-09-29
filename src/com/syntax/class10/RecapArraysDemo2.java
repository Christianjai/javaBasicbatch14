package com.syntax.class10;

import java.util.Arrays;

public class RecapArraysDemo2 {

	public static void main(String[] args) {
		
		String[] dresses=new String[] {"Pink dress","coctail","Summer dress","Night dress","Pencil dress"}; 
		//last index is always size-1, because arrays
		//index start from zero
		System.out.println(dresses.length);
		//Mostly this is ho you will be using arrays
		for (int i=0; i<dresses.length; i++) {
			System.out.println("Lets try "+dresses[i]);
			
		}
		System.out.println("- - - - - - - - - - - - - - - -");
		
		//enhanced for loop
		for (String dress:dresses) {
			System.out.println(dress);
			
		}
		System.out.println("------------------");
		//Prints all the elements of array without a loop
		System.out.println(Arrays.toString(dresses));

	}

}
