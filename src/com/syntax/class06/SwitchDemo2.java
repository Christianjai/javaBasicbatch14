package com.syntax.class06;

public class SwitchDemo2 {
	public static void main(String[] args) {
		
		//matching cases must be of same data type as a variable in switch
		//for example char='S'; int=12; String="whats up"
		//no duplicate cases in switch method
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		System.out.println(answer);
		
		//limitations of SWITCH CASE
		
		/*
		 * switch case cant use logical operators
		 * swtich case cant use relational operators
		 */
		
		/*
		 * CANT work with boolean values data types
		 * CANT work with float/double and long data types
		 */
		
		
	}
}
