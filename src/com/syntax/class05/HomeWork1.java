package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What time is it for you?");
		
		int time=scan.nextInt();
		String timeOfTheDay;
		
		if (time>=1 && time<=11) {
			timeOfTheDay="Morning";
		}else if (time>=12 && time<=15) {
			timeOfTheDay="Afternoon";
		} else if (time>=14 && time<=20) {
			timeOfTheDay="Evening";
		}else if (time>=21 && time<=24) {
			timeOfTheDay="Night";
		} else {
			System.out.println("Wrong numer is entered");
			timeOfTheDay="Invalid";
			
		}
		System.out.println(timeOfTheDay);
	}

}
