package com.syntax.class09;

public class HomeWork3 {

	public static void main(String[] args) {

		// Create an array on integers and calculate the sum of all elements in an array

		int[] num = { 10, 20, 30, 40, 50 };
		int sum = 0;
	

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-");
		
		
		//enhanced for loop!! same task
		sum=0;
		for (int number :num) {
			sum+=number;
		}
		System.out.println(sum);

	}

}
