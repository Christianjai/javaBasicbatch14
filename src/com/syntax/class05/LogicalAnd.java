package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean understandJava = true;
		boolean enjoyJava = true;
		boolean practice = true;

		if (understandJava && enjoyJava && practice) {
			System.out.println("This is awesome");
		}

		System.out.println("another example");

		int num1 = 100;
		int num2 = 200;
		int num3 = 300;

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest");
		} else if (num2 > num3 && num2 > num1) {
			System.out.println(num2 + " is the largest");
		} else if (num3 > num1 && num3 > num2) {
			System.out.println(num3 + " is the largest");
		}
	}

}
