package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperatorsRecap4 {
	
	//NOT OPERATOR !
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter if you are comfy with java logical operators now");
		
		boolean goodWithOp=scan.nextBoolean();
		
		if (!goodWithOp) {
			System.out.println("Do some more research, solve some repls and take some rest");
		}
		
		
	}

}
