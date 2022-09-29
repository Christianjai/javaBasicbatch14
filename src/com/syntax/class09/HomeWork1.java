package com.syntax.class09;

public class HomeWork1 {
	public static void main(String[] args) {

		// Create an array of cars and store 6 elements into it.
		// Using 2 different loops print all values from the array.

		String[] car = { "bmw", "toyota", "kia", "tesla", "ford", "mercedez benz" };
		{

			for (String cars : car) {
				System.out.println(cars);

			}

			System.out.println("- - - - - - - ");

			for (int i = 0; i < car.length; i++) {
				System.out.println(car[i]);
			}

		}

	}
}
