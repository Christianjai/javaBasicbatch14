package com.syntax.class07;

public class NewTask {
	public static void main(String[] args) {

		// from the range of 1 to 50 please find the sum of all even and all odd numbers

		int even = 0;
		int odd = 0;

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				even = even + i;

			}
			if (i % 2 == 1) {
				odd = odd + i;
			}
		}
		System.out.println("sum of even numbers " + even);
		System.out.println("sum of odd number " + odd);

	}

}
