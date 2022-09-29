package com.syntax.class10;

import java.util.Arrays;

public class RecapArraysDemo3 {

	public static void main(String[] args) {
		
		int size=10;
		int[] arr=new int[10];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=5;
		}
		System.out.println(Arrays.toString(arr));
	}

}
