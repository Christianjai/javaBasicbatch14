package com.syntax.class10;

public class Recap2DArraysDemo1 {

	public static void main(String[] args) {
		
		String[] individualsInRoom1=new String [] {"Chris", "Mike", "Sam"};
		String[] individualsInRoom2=new String [] {"Roope", "Pelle", "Axel"};
		String[] individualsInRoom3=new String [] {"Alvari", "Henkka", "Mikko"};
		//an 2D array that will store 3 single d arrays
		String[][] rooms=new String[3][];
		rooms[0]=individualsInRoom1;
		rooms[1]=individualsInRoom2;
		rooms[2]=individualsInRoom3;
		
		System.out.println(rooms[1][1]);
		System.out.println(rooms[2][2]);
		
	}

}
