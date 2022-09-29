package com.syntax.class06;

public class LogicalOperatorsRecap3 {
	public static void main(String[] args) {
		
		// EXAMPLE USING LOGICAL AND RELATIONAL OPERATIONS
		
		
		double savings=200000;
		boolean freeTime=true;
		String season="Summer";
		
		
		if(savings>100000 && freeTime && season.equals("Summer")) {
			System.out.println("Lets go to Bora Bora");
		} else {
			System.out.println("I need time and money");
		}
		
	}

}
