package com.syntax.class07;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		
		int time=10;

		if (time<12) {
			System.out.println("good morning inside if statement");  //going to print it 1 time
		}
		
		/* infinite loop
		 * while (time<12) {
		 *System.out.println("good morning"); 
		 *}
		 */
		while (time<12) {
			System.out.println("good morning inside while loop");
			time++;
		}
	
	}

}
