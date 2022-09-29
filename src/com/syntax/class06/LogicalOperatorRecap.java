package com.syntax.class06;

public class LogicalOperatorRecap {
	public static void main(String[] args) {

		// LOGICAL AND EXAMPLE (ALL CONDITION INSIDE () MUST BE TRUE TO EXECUTE THE
		// FIRST System.out.println)

		boolean programmer = true;
		boolean manualTester = true;
		boolean knowFramework = true;

		if (programmer && manualTester && knowFramework) {
			System.out.println("You can be an automation engineer");
		} else {
			System.out.println("You must know a progreamming language an manual testing to be and automation engineer");
		}
	}

}
