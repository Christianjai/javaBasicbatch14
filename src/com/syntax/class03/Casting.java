package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		
		/*
		 * type casting ->  type = data type casting= converting
		 * converting one data type to another
		 * 
		 * smaller -> larger data type = implicit
		 * larger -> smaller data type = explicit (warnings)
		 */
		
		byte box1=127; //smallest box (8 bits)
		short box2=3333; // 16 bit
		int box3=45454545; // 32 bits
		long box4=45454545L; // box 64 bit
		float box5=123123213; // larger box
		double box6=112312313; // largest

		int number=(int)15.2; // we cant store the decimal (0.1) in a "int" box
		System.out.println(number);
		
		byte smallerBox=(byte)box2;   // <- bigger data into smaller (java complains)
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		long box7=box1; // we can do this because box7 is larger than box1
		
		float box8=(float)box6; // as box6 is larger it is double we need type casting to assign value (we need to force java)
		
		System.out.println(box6);
		
		char g=(char) 67;
		System.out.println(g);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		
		
		
		
		
		
		
	}

}
