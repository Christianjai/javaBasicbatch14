package com.syntax.class07;

public class HomeWork4 {

	public static void main(String[] args) {

		// 4. Print odd numbers between 20 and 50 (2 ways)

		int i = 21;

		while (i <= 50) {
			System.out.print(i + " ");
			i += 2;

		}

		System.out.println("------------------");

		int ii = 20;

		while (ii <= 50) {
			if (ii % 2 == 1) {
				System.out.print(ii + " ");
			}
			ii++;
		}

	}
}
