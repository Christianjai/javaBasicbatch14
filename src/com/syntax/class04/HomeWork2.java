package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		/*Create a Java program that will ask user to input city and temperature. 
		 *Your program should convert Fahrenheit into celsius and print 
		 *“The temperature is the city  is ”
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What city are you from?");
		String city=scan.nextLine();
		System.out.println("What is the temperature there?");
		
		double fahr=scan.nextDouble();
		double cel=(fahr-32)*5/9;
		
		System.out.println("The temperature in "+city+" is "+fahr+"F there is "+cel+" degrees of Celcius");
		
		
	}

}
