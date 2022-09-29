package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {


		/*
		 *Create an array of names and store all names of your group. 
		 *Then print your name from that array. 
		 *(use 2 different ways of creating an array).
		 */
		
		String[] name=new String[5];
		
		name[0]="Mike";
		name[1]="Bob";
		name[2]="Chris";
		name[3]="Sam";
		
		String[] names= {"Mike","Bob","Chris","Sam"};
		
		System.out.println(names[2]);
		System.out.println(name[2]);

	}

}
