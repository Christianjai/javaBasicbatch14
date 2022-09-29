package com.syntax.class04;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		
		/*Create a Java program and store values of mortgage rate and mortgage price. 
		 *First, program should check if rate is higher than 4.5 user will not buy a house, 
		 *otherwise user will consider buying. Once user decides to buy a house, 
		 *if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash
         * 
		 */
		Scanner scan= new Scanner (System.in);
		
		System.out.println("What is your mortgage rate?");
		double mortgagerate=scan.nextDouble();
		if (mortgagerate>4.5) {
			System.out.println("You can buy a house");
		} else {
			System.out.println("You should consider buyin a house");
		}
			System.out.println("What is your morgage price?");
		double mortgageprice=scan.nextDouble();
		if (mortgageprice>200000) {
			System.out.println("You can take a loan");
		}else {
			System.out.println("You need to pay cash");
		}
			
		
		
	}

}
