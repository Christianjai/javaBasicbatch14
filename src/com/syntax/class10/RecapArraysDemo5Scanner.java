package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class RecapArraysDemo5Scanner {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please enter the number of dresses you want to buy");
		int size=scan.nextInt();
		
		double[] prices=new double[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter the price of dress nro "+ (i+1));
			prices[i]=scan.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		
		double sum=0;
		for (double price:prices) {
			sum+=price;
			System.out.println("Total for all the dresses"+sum);
			
			//limitations of enhanced for loop
			// we can only go in one direction
			// we can't skip the elements
			// we cans use enhanced for loop to update the elements in an array
			// we can only use it to access the elements
			
		}

	}
	
}
