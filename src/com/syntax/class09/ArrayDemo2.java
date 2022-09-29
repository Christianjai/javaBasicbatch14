package com.syntax.class09;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		String[] drinks= {"fanta","milk","juice", "lemonade","water","dr pepper"};
		
		System.out.println(drinks[2]); //juice
		
		//how many elements inside my array?
		
		int size=drinks.length; //--> will give number of elements in array
		
		System.out.println("Size of my array = "+size);		

}
}