package com.syntax.class09;

public class HomeWork2 {

	public static void main(String[] args) {

		// Create an array of animals and store 5 elements into it.
		// Using 2 different loops print all elements from the array.

		String[] animal = { "cat", "dog", "mouse", "giraffe", "lion" };

		for (String animals : animal) {
			System.out.println(animals);
		}

		System.out.println("- - - ");

		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i]);
		}

	}

}
