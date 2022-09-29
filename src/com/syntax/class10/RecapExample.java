package com.syntax.class10;

public class RecapExample {

	public static void main(String[] args) {
		
		String[] week= {"Monday","Sunday","Tuesday", "Thursday", "Friday"};
		
		// if day is Sunday-> it is a fun day
		//otherwise -> it is a boring day
		
		for (String day:week) {
			if (day.equals("Sunday")) {
				System.out.println(day+" is a fun day");
			} else if (day.equals("Friday")) {
				System.out.println(day+" is a peace day");
			} else {
				System.out.println(day+" is a boring day");
			}
			
			// LEARN THIS!! THIS IS HOW YOU USE STRINGS IN ENHANCED FOR LOOP
		}

	}

}
