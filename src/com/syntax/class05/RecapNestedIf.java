package com.syntax.class05;

public class RecapNestedIf {

	// !!!!!!!!!!!!!!!! to format code press cntrl + shift + f!!!!!!!!!!!!!!!!!!!
	public static void main(String[] args) {

		boolean allergy = true;
		String allergyType = "Milk";

		if (allergy) {
			System.out.println("Lets check what allergy you have");
			if (allergyType.equalsIgnoreCase("Pollen")) { // equalsIgnoreCase it will ignore P or p small or capitol letters
				System.out.println("Try to stay indoor when trees are blooming");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Please stay away from dairy products");
			} else {
				System.out.println("We need to do some tests");
			}

		} else {
			System.out.println("You are lucky");
		}

	}

}
