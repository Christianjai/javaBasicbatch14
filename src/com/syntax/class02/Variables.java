package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Christian";
		String lastname="Jailojan";
		String grade="A";
		String city="Tampere";
		String state="Finland";
		String phone="123123123";
		
		System.out.println("My name is "+name+" and my last name is "+lastname+".");
		System.out.println("I am "+grade+" student.");
		System.out.println("I live in "+city+", "+state+".");
		System.out.println("And my phone number is "+phone+".");
		
		city="Los Angeles";
		state="California";
		phone="543123532";
		grade="B";
		
		System.out.println("My name is "+name+" and I moved to "+city+", "+state+".");
		System.out.println("My new phone number is "+phone+".");
		
		//rules for indentifiriers=name (variables,methods)
		//1rule. cant use KEYWORDS as identifiers
		//String new="Hello";
		
		//2rule. cant have spaces in identifiers
		//String last name="Jailojan";
		
		//3rule. identifiers cant start with numbers
		//int 1number=123;
		int number1=123; //number can be anywhere after 1st character
		
		/*4rule. Identifiers cant contain any special characters
		 * except $ or _
		 * boolean hello$=true; <- can be used
		 * boolean hello_=false; <- can be used
		 */
		double $price=1.99;
		float _price=0.99F;
		
		/* Naming Conventions
		 * Class should start with Uppercase and follow camelCasing
		 * 
		 *variables should start with lowercase and follow camelCasing
		 */
		String Weather="hot"; //not preffered
		String myWheater="rainy"; //preffered
		
		
		
				
			

	}

}
