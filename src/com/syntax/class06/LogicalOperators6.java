package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperators6 {
	public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Are you from batch 14");
        String batch14=scan.next();
        if(batch14.equalsIgnoreCase("yes"))
        {
            System.out.println("You are amazing");
        }
        else 
        {
            System.out.println("You are good");
        }
    }

}
