package com.syntax.class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		
		
		int time=2;
		String day="Monday";
		
		
		/*
		 *outer if condition (if it is true, then only inner conditions will be checked) 
		 *if its false nothing from inner if condition will be executed it is like the main door.
		 * If main door is closed we can't enter the building. 
		 */
		
		if(day.equals("Monday")) {  // <- this is Outer if condition. As String is not primitive we can't use == sign, we have to use .equals()
			
			if(time>7) {
				System.out.println("Lets go to office"); //inner if condition
			} 
				
			if (time<6) {
				System.out.println("Lets sleep more");
			}
		}

	}

}
