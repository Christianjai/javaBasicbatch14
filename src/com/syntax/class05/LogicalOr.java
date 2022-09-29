package com.syntax.class05;

public class LogicalOr {
	public static void main(String[] args) {
		
		String day="Saturday";
		
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class at Syntax - using logical OR");
		}
		if (day.equals("Saturday") && day.equals("Sunday")) {
			System.out.println("I have Java class at Syntax - using logical AND");
		}
		
		double money= 90000;
		String title="Automation tester";
		
		if (title.equals("Automation tester") || money==120000) {
			System.out.println("Happy");
			
		}
		
	}

}
